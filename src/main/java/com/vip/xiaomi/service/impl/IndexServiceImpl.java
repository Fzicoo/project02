package com.vip.xiaomi.service.impl;

import com.vip.xiaomi.domain.vo.NavigationVo;
import com.vip.xiaomi.domain.vo.SubMenuVo;
import com.vip.xiaomi.mapper.NavigationMapper;
import com.vip.xiaomi.mapper.SubMenuMapper;
import com.vip.xiaomi.service.IndexService;
import com.vip.xiaomi.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/27 9:17
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {
    @Resource
    NavigationMapper navigationMapper;

    @Resource
    SubMenuMapper subMenuMapper;

    @Override
    public CateBean getHeader() {
        CateBean cateBean = new CateBean();
        List<NavigationVo> navigation = navigationMapper.findNavigation();
        cateBean.setNavigationVoList(navigation);
        return cateBean;
    }

    @Override
    public CateBean getSubMenu() {
        CateBean cateBean = new CateBean();
        List<SubMenuVo> menu = subMenuMapper.findMenu();
        cateBean.setSubMenuVoList(menu);
        return cateBean;
    }
}
