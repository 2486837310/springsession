package com.offcn.springsession.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SixThymeleafController {
    /**
     * 访问localhost:8080/java003 页面
     * 将数据message填充到templates/index6.html
     * @param model
     * @return
     */
    @GetMapping("/six")
    public String indexPage(Model model) {
        return "index6";
    }
}
