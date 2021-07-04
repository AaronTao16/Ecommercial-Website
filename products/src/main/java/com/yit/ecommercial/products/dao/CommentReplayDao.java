package com.yit.ecommercial.products.dao;

import com.yit.ecommercial.products.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 10:22:50
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
