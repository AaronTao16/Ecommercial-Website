package com.yit.ecommercial.members.dao;

import com.yit.ecommercial.members.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 18:48:50
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
