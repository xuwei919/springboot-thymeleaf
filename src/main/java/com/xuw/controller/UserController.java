package com.xuw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: 许伟
 * @CreateTime: 2021/3/22 17:51
 */
@Controller
public class UserController {

    /**
     * 跳转到用户列表
     *
     * @return
     */
    @GetMapping("/userList")
    public String userList(Model model) {
        List<String> a = Arrays.asList("1", "2", "a");
        model.addAttribute("users", a);
        return "user/user-list";
    }
}
