package com.xsomnus.patterns.behavior.proxy;

import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/2 0002 10:36
 */
public class CglibProxyHandler implements InvocationHandler {

    private Object object;

    public CglibProxyHandler(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("CGLIB动态代理");
        System.out.println("租房子前的操作：看房子，询问价格");
        Object ret = method.invoke(object, objects);
        System.out.println("租房子后的操作： 付款，搬进新房子");
        return ret;
    }
}
