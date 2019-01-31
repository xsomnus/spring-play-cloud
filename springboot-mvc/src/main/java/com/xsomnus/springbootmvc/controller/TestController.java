package com.xsomnus.springbootmvc.controller;

import com.xsomnus.springbootmvc.config.PlaceOrderSession;
import com.xsomnus.springbootmvc.pojo.User;
import com.xsomnus.springbootmvc.pojo.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * @author somnus_xiawenye
 * @since 2018/11/28 0028 11:41
 */
@Slf4j
@RestController
public class TestController {

    @Autowired
    PlaceOrderSession placeOrderSession;

    @PostMapping("/user")
    public UserRequest addUser(@RequestBody UserRequest request) {
        log.info("request: {}", request);
        return request;
    }

    @GetMapping("/test1")
    public ServletContext test1(HttpServletRequest request) {
        return placeOrderSession.sessionId();
    }

    @GetMapping("/test2")
    public ServletContext test2(HttpServletRequest request) {
        return placeOrderSession.sessionId();
    }


    @GetMapping("/testjackson")
    public User getUser() {
        return new User(12, "既然选择远方，便只顾风雨兼程");
    }

}
