package com.offcn.springsession.controller;

import com.offcn.springsession.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ThreeThymeleafController {

    /**
     * 访问localhost:8080/java003 页面
     * 将数据message填充到templates/index3.html
     * @param model
     * @return
     */
    @GetMapping("/three")
    public String indexPage(Model model) {

        ArrayList<User> list = new ArrayList<>();
        User user = new User();
        user.setAge(18);
        user.setId(12);
        user.setName("杜利朋");
        list.add(user);

        User user1 = new User();
        user1.setAge(19);
        user1.setId(120);
        user1.setName("杜利朋1");
        list.add(user1);

        User user2 = new User();
        user2.setAge(182);
        user2.setId(122);
        user2.setName("杜利朋2");
        list.add(user2);

        model.addAttribute("userlist",list);
        return "index3";
    }
}
