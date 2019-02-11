package com.sparrow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wancheng on 2019/1/16.
 */
@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(ModelAndView model)  {
        return "index";
    }
}
