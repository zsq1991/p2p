package com.p2p.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/12/15.
 */
@RestController
public class IndexController {
    @RequestMapping("/test")
    public String test(){
        return "success------front";
    }
}
