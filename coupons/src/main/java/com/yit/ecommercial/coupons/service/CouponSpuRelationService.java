package com.yit.ecommercial.coupons.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yit.common.utils.PageUtils;
import com.yit.ecommercial.coupons.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 18:24:43
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

