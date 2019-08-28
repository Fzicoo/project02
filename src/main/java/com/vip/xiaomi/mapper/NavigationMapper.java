package com.vip.xiaomi.mapper;

import com.vip.xiaomi.domain.vo.NavigationVo;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/27 0:20
 */
public interface NavigationMapper {
    List<NavigationVo> findNavigation();
}
