package com.springboot.springbootfreemarker.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.springbootfreemarker.pojo.Old;
import com.springboot.springbootfreemarker.pojo.PDFDataTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface OldMapper extends BaseMapper<PDFDataTest> {
    List<Old> findByIds(@Param("ids") List<Long> ids);
}
