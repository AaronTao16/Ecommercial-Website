package com.yit.ecommercial.members.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yit.common.utils.PageUtils;
import com.yit.ecommercial.members.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 18:48:50
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

