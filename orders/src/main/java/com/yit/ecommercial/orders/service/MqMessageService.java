package com.yit.ecommercial.orders.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yit.common.utils.PageUtils;
import com.yit.ecommercial.orders.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 18:54:51
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

