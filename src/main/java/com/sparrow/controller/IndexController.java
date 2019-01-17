package com.sparrow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wancheng on 2019/1/16.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index()  {
        return "forward:index.html";
    }
}
