package com.yit.ecommercial.products.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yit.common.utils.PageUtils;
import com.yit.ecommercial.products.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 10:22:50
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

