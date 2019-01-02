package com.xsomnus.patterns.behavior.proxy;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/2 0002 10:10
 */
public class ProxyTest {
    public static void main(String[] args) {
        System.out.println("---------------------不使用代理-------------");
        HouseRent houseRent = new HouseRentImpl();
        houseRent.rent();
        System.out.println("---------------------使用代理-------------");
        HouseRentProxy houseRentProxy = new HouseRentProxy(houseRent);
        houseRentProxy.rent();
    }
}
