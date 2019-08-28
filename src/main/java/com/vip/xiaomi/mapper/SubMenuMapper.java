package com.vip.xiaomi.mapper;

import com.vip.xiaomi.domain.entity.SubMenu;
import com.vip.xiaomi.domain.vo.SubMenuVo;

import java.util.List;

/**
* @author LFZicoo
* @date 2019/8/27 13:00
*/
public interface SubMenuMapper {
    List<SubMenuVo> findMenu();
}