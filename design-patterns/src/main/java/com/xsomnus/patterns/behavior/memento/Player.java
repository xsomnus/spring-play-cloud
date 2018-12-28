package com.xsomnus.patterns.behavior.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/28 0028 18:14
 */
@Data
@AllArgsConstructor
public class Player {

    private int level;
    private int life;

    public SaveMsg saveStateToMemento() {
        return new SaveMsg(level, life);
    }

    public void getStateFromMemento(SaveMsg sm) {
        this.level = sm.getLevel();
        this.life = sm.getLevel();
    }

    public void getStatus() {
        System.out.println("玩家当前信息:\n 人物等级: + " + level + ", 人物生命: " + life);
    }

    public void leveling() {
        this.level = this.level + 1;
        this.life = this.life + 10;
        System.out.println("恭喜玩家xuwujing升级!等级提升了1,生命提升了10！\n");
    }

    public boolean challengeBoss() {
        return this.level > 3 && this.life > 100;
    }


}
