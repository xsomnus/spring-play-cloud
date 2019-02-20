package com.xsomnus.springbootredis.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xsomnus.springbootredis.pojo.entity.SysUser;
import com.xsomnus.springbootredis.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author somnus_xiawenye
 * @since 2018/11/29 0029 9:57
 */
@Slf4j
@RestController
public class SysUserController {

    @Resource
    SysUserService sysUserService;


    @GetMapping("/sys/users")
    public IPage<SysUser> listAll(@RequestParam Long page,
                                  @RequestParam Long limit) {
        log.info("查询所有的用户Controller方法内");
        return sysUserService.listAll(page, limit);
    }


    @GetMapping("/page")
    public IPage<SysUser> listPage(SysUserQuery query) {
        log.info("sysUserQuery: {}", query);
        return sysUserService.listAll(query.getPage(), query.getLimit());
    }

    @PostMapping("/sys/user")
    public Boolean addUser() {
        return sysUserService.addUser();
    }

    @PutMapping("/sys/user")
    public Boolean updateById(@RequestBody SysUser sysUser) {
        return sysUserService.updateById(sysUser);
    }

}
