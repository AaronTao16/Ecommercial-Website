package com.yit.ecommercial.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yit.common.utils.PageUtils;
import com.yit.ecommercial.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 18:56:35
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

