package com.xsomnus.springbootmvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/29 0029 13:42
 */
@Configuration
public class PlaceOrderSession {

    @Autowired
    WebApplicationContext webApplicationContext;

    @Scope(WebApplicationContext.SCOPE_SESSION)
    @Bean
    public ServletContext sessionId() {
        return webApplicationContext.getServletContext();
    }
}
