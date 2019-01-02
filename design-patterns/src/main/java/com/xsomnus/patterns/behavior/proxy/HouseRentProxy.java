package com.xsomnus.patterns.behavior.proxy;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/2 0002 10:06
 */
public class HouseRentProxy implements HouseRent{

    private HouseRent houseRent;

    public HouseRentProxy(final HouseRent houseRent) {
        this.houseRent = houseRent;
    }

    public void rent() {
        System.out.println("租房子前的操作：看房子，询问价格");
        houseRent.rent();
        System.out.println("租房子后的操作： 付款，搬进新房子");
    }
}
