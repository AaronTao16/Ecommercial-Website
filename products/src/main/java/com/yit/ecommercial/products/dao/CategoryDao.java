package com.yit.ecommercial.products.dao;

import com.yit.ecommercial.products.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 10:22:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
