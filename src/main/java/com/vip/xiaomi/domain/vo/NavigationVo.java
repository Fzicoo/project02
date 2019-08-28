package com.vip.xiaomi.domain.vo;

import com.vip.xiaomi.domain.entity.NavMenu;
import com.vip.xiaomi.domain.entity.Navigation;
import lombok.Data;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/27 0:43
 */
@Data
public class NavigationVo extends Navigation {
    List<NavMenu> navMenuList;
}
