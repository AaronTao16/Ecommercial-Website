package com.yit.ecommercial.coupons.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yit.ecommercial.coupons.entity.CouponEntity;
import com.yit.ecommercial.coupons.service.CouponService;
import com.yit.common.utils.PageUtils;
import com.yit.common.utils.R;



/**
 * 优惠券信息
 *
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 18:24:43
 */
@RefreshScope
@RestController
@RequestMapping("coupons/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    // test feign int member/feign
    @RequestMapping("/member/list")
    public R memberCoupon(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("discount 10%");
        return R.ok().put("coupon", Arrays.asList(couponEntity));
    }

    // nacos register - nacos-config and boostrap(spring boot version 2.5+)
    // priority bootstrap > application
    // auto refresh in nacos @RefreshScope
    // find in application.properties
    @Value("${coupon.user.name}")
    private String name;
    @Value("${coupon.user.discount}")
    private String discount;

    @RequestMapping("/test")
    public R test(){
        return R.ok().put("name", name).put("discount", discount);
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
