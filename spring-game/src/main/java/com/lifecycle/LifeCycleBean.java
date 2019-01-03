package com.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/3 0003 10:00
 */
public class LifeCycleBean implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware, BeanPostProcessor, InitializingBean, DisposableBean {

    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        System.out.println("属性注入");
        this.test = test;
    }


    public LifeCycleBean() {
        System.out.println("构造器方法");
    }

    public void display() {
        System.out.println("方法调用" + this.toString());
    }

    @Override
    public String toString() {
        return "LifeCycleBean{" +
                "test='" + test + '\'' +
                '}';
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("BeanClassLoaderAware 被调用...");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware 被调用...");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware 被调用...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy 被调动...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet 被调动...");
        this.test = "AfterPropertiesSet_" + this.test;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor postProcessBeforeInitialization 被调用...");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor postProcessAfterInitialization 被调用...");
        return bean;
    }

    public void initMethod() {
        System.out.println("init-method 被调用...");
    }

    public void destroyMethod() {
        System.out.println("destroy-method 被调用...");
    }

    @PostConstruct
    public void postConstructMethod() {
        System.out.println("postConstructMethod 被调用...");
    }

    /*@Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory 被调用");
    }*/
}
