package com.yit.ecommercial.coupons.dao;

import com.yit.ecommercial.coupons.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 18:24:43
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
