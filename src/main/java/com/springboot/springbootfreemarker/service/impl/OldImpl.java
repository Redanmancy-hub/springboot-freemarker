package com.springboot.springbootfreemarker.service.impl;

import com.springboot.springbootfreemarker.mapper.OldMapper;
import com.springboot.springbootfreemarker.pojo.Old;
import com.springboot.springbootfreemarker.service.IOldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OldImpl implements IOldService {
    @Resource
    private OldMapper oldMapper;

    @Override
    public List<Old> queryByIds(List<Long> selectedIds) {
        List<Old> oldList = oldMapper.findByIds(selectedIds);
        if (oldList.isEmpty()){
            System.out.println("未查询到数据");
        }
        return oldList;
    }
}
