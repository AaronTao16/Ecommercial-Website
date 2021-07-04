package com.yit.ecommercial.products.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yit.common.utils.PageUtils;
import com.yit.ecommercial.products.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 10:22:50
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

