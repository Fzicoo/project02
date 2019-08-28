package com.vip.xiaomi.utils;

import com.vip.xiaomi.domain.vo.NavigationVo;
import com.vip.xiaomi.domain.vo.SubMenuVo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/27 9:15
 */
@Data
public class CateBean implements Serializable {

    List<NavigationVo> navigationVoList;
    List<SubMenuVo> subMenuVoList;
}
