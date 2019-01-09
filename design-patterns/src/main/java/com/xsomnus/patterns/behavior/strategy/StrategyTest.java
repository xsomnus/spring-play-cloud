package com.xsomnus.patterns.behavior.strategy;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/7 0007 15:18
 */
public class StrategyTest {
    public static void main(String args[]) {
        int arr[] = {1, 4, 6, 2, 5, 3, 7, 10, 9};
        int result[];
        ArrayHandler ah = new ArrayHandler();

        Sort sort = new BubbleSort();    //使用选择排序

        ah.setSortObj(sort); //设置具体策略
        result = ah.sort(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}
