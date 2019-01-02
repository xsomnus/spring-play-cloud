package com.xsomnus.patterns.behavior.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/2 0002 10:40
 */
public class CglibProxyHandler2 implements MethodInterceptor {

    private Object target;

    public Object getInstance(final Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB动态代理2");
        System.out.println("租房子前的操作：看房子，询问价格");
        Object ret = methodProxy.invokeSuper(object, args);
        System.out.println("租房子后的操作： 付款，搬进新房子");
        return ret;
    }
}
