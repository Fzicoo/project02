package com.vip.xiaomi.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author LFZicoo
 * @date 2019/8/27 19:11
 */
@Data
public class Shop {
    private Integer shopId;

    private String shopName;

    private String shopMsg;

    private BigDecimal originalPrice;

    private BigDecimal promotePrice;

    private Integer stock;

    private Integer cateId;

    private Date createDate;

    private Integer status;

    private String title;
}