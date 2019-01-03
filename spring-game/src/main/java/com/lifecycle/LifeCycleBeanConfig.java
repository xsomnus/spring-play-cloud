package com.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/3 0003 10:09
 */
@Configuration
public class LifeCycleBeanConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public LifeCycleBean lifeCycleBean() {
        LifeCycleBean lifeCycleBean = new LifeCycleBean();
        lifeCycleBean.setTest("TEST");
        return lifeCycleBean;
    }

}
