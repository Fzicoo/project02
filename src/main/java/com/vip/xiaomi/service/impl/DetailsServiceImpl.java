package com.vip.xiaomi.service.impl;

import com.vip.xiaomi.domain.entity.Shop;
import com.vip.xiaomi.mapper.ShopMapper;
import com.vip.xiaomi.service.DetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LFZicoo
 * @date 2019/8/27 19:44
 */
@Service
public class DetailsServiceImpl implements DetailsService {
    @Resource
    ShopMapper shopMapper;
    @Override
    public Shop findById(int id) {
        Shop shop = shopMapper.findById(id);
        return shop;
    }

    @Override
    public Shop findByName(String name) {
        Shop shop = shopMapper.findByName(name);
        return shop;
    }
}
