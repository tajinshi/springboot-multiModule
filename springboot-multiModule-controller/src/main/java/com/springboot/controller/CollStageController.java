package com.springboot.controller;


import com.springboot.api.CollStageService;
import com.springboot.common.ApiResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 催收-催收阶段表 前端控制器
 * </p>
 *
 * @author D.Yang
 * @since 2018-10-29
 */
@RestController
@RequestMapping("/springtest/collStage")
public class CollStageController {

    @Autowired
    private CollStageService collStageService;

    @PostMapping("getStageById")
    @ApiOperation(value = "查询阶段", response = ApiResponse.class)
    public ApiResponse getStageById(String id) {
        ApiResponse apiResponse = null;
        try {
            return ApiResponse.success(collStageService.getStageById(id));
        } catch (Exception e) {
            e.printStackTrace();
            apiResponse = ApiResponse.error("请求异常");
        }
        return apiResponse;
    }



}

