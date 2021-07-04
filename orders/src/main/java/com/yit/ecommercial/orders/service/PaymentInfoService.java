package com.yit.ecommercial.orders.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yit.common.utils.PageUtils;
import com.yit.ecommercial.orders.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 18:54:51
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

