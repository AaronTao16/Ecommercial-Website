package com.yit.ecommercial.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yit.common.utils.PageUtils;
import com.yit.ecommercial.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 18:56:35
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

