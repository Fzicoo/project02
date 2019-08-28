package com.vip.xiaomi.mapper;

import com.vip.xiaomi.domain.entity.Shop;
import org.apache.ibatis.annotations.Param;

/**
* @author LFZicoo
* @date 2019/8/27 19:11
*/
public interface ShopMapper {
    /**查询商品详情*/
    Shop findById(@Param("id") int id);

    /**查询商品详情*/
    Shop findByName(@Param("name") String name);
}