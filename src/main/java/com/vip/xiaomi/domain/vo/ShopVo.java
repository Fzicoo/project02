package com.vip.xiaomi.domain.vo;

import com.vip.xiaomi.domain.entity.Shop;
import com.vip.xiaomi.domain.entity.ShopImage;
import lombok.Data;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/27 19:15
 */
@Data
public class ShopVo extends Shop {
    List<ShopImage> shopImageList;
}
