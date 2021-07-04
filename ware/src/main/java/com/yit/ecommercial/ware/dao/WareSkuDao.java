package com.yit.ecommercial.ware.dao;

import com.yit.ecommercial.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 18:56:35
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
