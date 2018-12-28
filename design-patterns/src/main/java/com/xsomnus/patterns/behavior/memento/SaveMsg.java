package com.xsomnus.patterns.behavior.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/28 0028 18:13
 */
@Data
@AllArgsConstructor
public class SaveMsg {

    private int level;
    private int life;
}
