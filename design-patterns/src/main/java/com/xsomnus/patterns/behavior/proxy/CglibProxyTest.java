package com.xsomnus.patterns.behavior.proxy;

import net.sf.cglib.proxy.Proxy;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/2 0002 10:38
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        HouseRent rent = new HouseRentImpl();
        HouseRent proxyInstance =(HouseRent) Proxy.newProxyInstance(HouseRent.class.getClassLoader(), rent.getClass().getInterfaces(), new CglibProxyHandler(rent));
        proxyInstance.rent();

        CglibProxyHandler2 cglibProxyHandler2 = new CglibProxyHandler2();
        HouseRentImpl rent2 = (HouseRentImpl)cglibProxyHandler2.getInstance(rent);
        rent2.rent();
    }
}
