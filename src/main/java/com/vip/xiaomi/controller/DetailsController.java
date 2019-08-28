package com.vip.xiaomi.controller;

import com.vip.xiaomi.domain.entity.Shop;
import com.vip.xiaomi.service.DetailsService;
import com.vip.xiaomi.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LFZicoo
 * @date 2019/8/27 19:51
 */
@RestController
@RequestMapping("/api")
public class DetailsController {
    @Resource
    DetailsService detailsService;


    /**根据商品id查询商品详情*/
    @GetMapping("/findShop")
    public Result<Shop> findById(int id){
        try {
            Shop shop = detailsService.findById(id);
            return Result.success(shop);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**根据商品名字查询商品详情*/
    @GetMapping("/findByName")
    public Result<Shop> findByName(String name){
        try {
            Shop shop = detailsService.findByName(name);
            return Result.success(shop);
        } catch (Exception e) {
            return Result.error();
        }
    }

}
