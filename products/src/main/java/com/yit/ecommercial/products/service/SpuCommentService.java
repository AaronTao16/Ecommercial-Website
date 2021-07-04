package com.yit.ecommercial.products.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yit.common.utils.PageUtils;
import com.yit.ecommercial.products.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 10:22:50
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

