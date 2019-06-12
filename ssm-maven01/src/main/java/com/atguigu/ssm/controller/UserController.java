/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: UserController
 * @Package com.atguigu.ssm.controller
 * @author: apple
 * @date: 2019-06-12 14:53
 * @since JDK 1.8
 */
package com.atguigu.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.atguigu.ssm.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @ClassName : UserController
 * @AUTHOR :  apple
 * @DATE :    2019-06-12 14:53  
 * @DESCRIPTION : TODO(用一句话描述该类做什么)   
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger log= LoggerFactory.getLogger(UserController.class);


    // /user/test?id=1
    @ResponseBody
    @RequestMapping(value="/test",method= RequestMethod.GET)
    public String test(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        System.out.println("userId:"+userId);
        User user=null;
        if (userId==1) {
            user = new User();
            user.setAge(11);
            user.setId(1);
            user.setPassword("123");
            user.setUserName("javen");
        }

        log.debug(user.toString());
        model.addAttribute("user", user);
        return JSON.toJSONString(user);
    }
}
