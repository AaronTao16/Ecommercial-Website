package com.yit.ecommercial.members.feign;

import com.yit.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("coupons")
public interface CouponFeignService {

    @RequestMapping("coupons/coupon/member/list")
    public R memberCoupon();
}
