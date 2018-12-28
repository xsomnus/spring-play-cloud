package com.xsomnus.patterns.behavior.memento;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/28 0028 18:20
 */
public class GameSavePageTest {

    @Test
    public void testMemento() {
        Player player = new Player(1, 2);
        System.out.println("玩家xuwujing进入游戏!");        //状态
        player.getStatus();        //进行练级
        player.leveling();
        GameSavePage savePage = new GameSavePage();        //状态
        player.getStatus();
        System.out.println("玩家xuwujing正在存档...");        //第一次存档
        savePage.setSm(player.saveStateToMemento());
        System.out.println("玩家xuwujing存档成功!");
        System.out.println("玩家xuwujing挑战新手村的BOSS!");
        boolean flag = player.challengeBoss();
        if (flag) {
            System.out.println("玩家xuwujing挑战BOSS成功!");
            return;
        }
        System.out.println("玩家xuwujing挑战BOSS失败!游戏结束！开始读取存档...");
        savePage.getSm();
        System.out.println("玩家xuwujing读取存档成功!");        //进行练级
        player.leveling();        //状态
        player.getStatus();
        System.out.println("玩家xuwujing挑战新手村的BOSS!");
        flag = player.challengeBoss();
        if (flag) {
            System.out.println("玩家xuwujing挑战BOSS成功!");
            return;
        }

    }
}