package com.springboot.springbootfreemarker.service;

import com.springboot.springbootfreemarker.pojo.Old;

import java.util.List;

public interface IOldService {
    List<Old> queryByIds(List<Long> selectedIds);

}
