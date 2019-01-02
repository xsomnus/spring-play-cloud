package com.xsomnus.patterns.behavior.proxy;

import java.lang.reflect.Proxy;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/2 0002 10:17
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        HouseRent rent = new HouseRentImpl();

        HouseRent proxyHouseRent = (HouseRent) Proxy.newProxyInstance(HouseRent.class.getClassLoader(), rent.getClass().getInterfaces(), new DynamicProxyHandler(rent));
        proxyHouseRent.rent();
    }
}
