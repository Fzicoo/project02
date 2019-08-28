package com.vip.xiaomi.domain.vo;

import com.vip.xiaomi.domain.entity.SubMenu;
import com.vip.xiaomi.domain.entity.SubMenu1;
import lombok.Data;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/27 13:08
 */
@Data
public class SubMenuVo extends SubMenu {
    List<SubMenu1> subMenuList;
}
