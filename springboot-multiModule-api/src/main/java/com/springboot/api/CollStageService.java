package com.springboot.api;

import com.springboot.dao.bean.CollStage;

/**
 * <p>
 * 催收-催收阶段表 服务类
 * </p>
 *
 * @author D.Yang
 * @since 2019-01-03
 */
public interface CollStageService {
    CollStage getStageById(String id);
}
