package com.xsomnus.springbootredis.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xsomnus.springbootredis.pojo.entity.SysUser;

import java.util.List;

/**
 * @author somnus_xiawenye
 * @since 2018/11/29 0029 9:56
 */
public interface SysUserService extends IService<SysUser> {

    IPage<SysUser> listAll(Long page, Long limit);

    boolean addUser();


}
