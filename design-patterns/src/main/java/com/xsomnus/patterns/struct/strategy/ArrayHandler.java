package com.xsomnus.patterns.struct.strategy;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/7 0007 15:18
 */
public class ArrayHandler {

    private Sort sortObj;

    public int[] sort(int arr[]) {
        sortObj.sort(arr);
        return arr;
    }

    public void setSortObj(Sort sortObj) {
        this.sortObj = sortObj;
    }

}
