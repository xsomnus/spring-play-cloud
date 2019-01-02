package com.xsomnus.patterns.behavior.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/2 0002 10:13
 * <p>
 * JDK自带的动态代理的对象必须实现接口，因为jdk底层自动生成的字节码的文件，是implements对象的代理类
 * 这个也是为什么service需要分别实现接口以及由对应的实现类
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK动态代理");
        System.out.println("租房子前的操作：看房子，询问价格");
        Object ret = method.invoke(object, args);
        System.out.println("租房子后的操作： 付款，搬进新房子");
        return ret;
    }
}
