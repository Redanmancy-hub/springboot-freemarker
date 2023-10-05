package com.springboot.springbootfreemarker.controller;

import com.springboot.springbootfreemarker.pojo.Old;
import com.springboot.springbootfreemarker.pojo.PDFDataTest;
import com.springboot.springbootfreemarker.service.IOldService;
import com.springboot.springbootfreemarker.utils.PDFTemplateUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pdf")
public class PdfController {
    @Resource
    private IOldService iOldService;

    @GetMapping("/export")
    public void exportPdf(@RequestParam(value = "selectedIds", required = false) List<Long> selectedIds, HttpServletResponse response) throws Exception{
        ByteArrayOutputStream baos = null;
        OutputStream out = null;
        try {
            // 模板中的数据，实际运用从数据库中查询
            List<Old> detailList = iOldService.queryByIds(selectedIds);

            Map<String,Object> data = new HashMap<>();
            data.put("detailList", detailList);

            baos = PDFTemplateUtil.createPDF(data, "old.ftl");;
            // 设置响应消息头，告诉浏览器当前响应是一个下载文件
            response.setContentType( "application/x-msdownload");
            // 告诉浏览器，当前响应数据要求用户干预保存到文件中，以及文件名是什么 如果文件名有中文，必须URL编码
            String fileName = URLEncoder.encode("old.pdf", "UTF-8");
            response.setHeader( "Content-Disposition", "attachment;filename=" + fileName);
            out = response.getOutputStream();
            baos.writeTo(out);
            baos.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("导出失败：" + e.getMessage());
        } finally{
            if(baos != null){
                baos.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}
