package com.vip.xiaomi.domain.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author LFZicoo
 * @date 2019/8/27 0:41
 */
@Data
public class NavMenu {
    private Integer navId;
    private Integer menuId;
    private String menuName;
    private Integer status;
    private String navImg;
    private BigDecimal menuPrice;
    private Integer shopId;
}
