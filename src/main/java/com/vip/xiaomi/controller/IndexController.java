package com.vip.xiaomi.controller;

import com.vip.xiaomi.service.IndexService;
import com.vip.xiaomi.utils.CateBean;
import com.vip.xiaomi.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LFZicoo
 * @date 2019/8/26 23:46
 */
@RestController
@RequestMapping("/api")
public class IndexController {
    @Resource
    IndexService indexService;

    @GetMapping("/heads")
    public Result getHeaderData(){
        try {
            CateBean header = indexService.getHeader();
            return Result.success(header);
        } catch (Exception e) {
            return Result.error();
        }
    }

    @GetMapping("/menus")
    public Result getSubMenu(){
        try {
            CateBean subMenu = indexService.getSubMenu();
            return Result.success(subMenu);
        } catch (Exception e) {
            return Result.error();
        }
    }
}
