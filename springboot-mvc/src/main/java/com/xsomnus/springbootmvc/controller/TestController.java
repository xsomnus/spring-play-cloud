package com.xsomnus.springbootmvc.controller;

import com.xsomnus.springbootmvc.pojo.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author somnus_xiawenye
 * @since 2018/11/28 0028 11:41
 */
@Slf4j
@RestController
public class TestController {

    @PostMapping("/user")
    public UserRequest addUser(@RequestBody UserRequest request) {
        log.info("request: {}", request);
        return request;
    }

}
