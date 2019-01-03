package com.springboot.service;

import com.springboot.api.CollStageService;
import com.springboot.dao.bean.CollStage;
import com.springboot.dao.mapper.CollStageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollStageServiceImpl implements CollStageService {
    @Autowired
    private CollStageMapper collStageMapper;
    @Override
    public CollStage getStageById(String id) {
        CollStage collStage = collStageMapper.selectById(id);
        return collStage;
    }
}
