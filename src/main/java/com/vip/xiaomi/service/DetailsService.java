package com.vip.xiaomi.service;

import com.vip.xiaomi.domain.entity.Shop;

/**
 * @author LFZicoo
 * @date 2019/8/27 19:42
 */
public interface DetailsService {
    public Shop findById(int Id);

    public Shop findByName(String name);


}
