package com.xsomnus.springbootredis.pojo.entity;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * @author somnus_xiawenye
 * @since 2018/10/11 0011 18:02
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_user")
@KeySequence("sysUserId")
public class SysUser extends Model<SysUser> {

    @TableId
    private Long id;
    private String username;
    private String realName;
    private String password;
    private String telephone;
    private String avatar;
    private Long deptId;
    private OffsetDateTime createTime;
    @JsonIgnore
    private OffsetDateTime updateTime;
    private OffsetDateTime lastLoginTime;
    private Boolean deleted;
    private Boolean enabled;
    @Override
    protected Serializable pkVal() {
        return id;
    }
}
