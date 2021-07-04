package com.yit.ecommercial.members.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yit.common.utils.PageUtils;
import com.yit.ecommercial.members.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 18:48:50
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

