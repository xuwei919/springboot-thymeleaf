package com.xuw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author: 许伟
 * @CreateTime: 2021/3/22 16:55
 */
@Controller
public class IndexController {

    @GetMapping({ "/index", "index.html" })
    public String toIndex() {
        return "index";
    }
}
