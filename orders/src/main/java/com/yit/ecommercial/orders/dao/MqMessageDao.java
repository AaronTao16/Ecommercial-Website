package com.yit.ecommercial.orders.dao;

import com.yit.ecommercial.orders.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 18:54:51
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
