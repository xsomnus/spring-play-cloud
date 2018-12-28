package com.xsomnus.springbootredis.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xsomnus.springbootredis.mapper.SysUserMapper;
import com.xsomnus.springbootredis.pojo.entity.SysUser;
import com.xsomnus.springbootredis.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author somnus_xiawenye
 * @since 2018/10/11 0011 18:07
 */
@Slf4j
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public boolean save(SysUser entity) {
        return super.save(entity);
    }

    @Cacheable(keyGenerator = "wiselyKeyGenerator", value = {"sysUsers", "sysUserList"})
    public IPage<SysUser> listAll(Long page, Long limit) {
        log.info("查询所有的用户ServiceImpl实现");
        Page<SysUser> sysUserPage = new Page<>(page, limit);
        return page(sysUserPage);
    }

    @Override
    @CacheEvict(value = {"sysUsers"}, allEntries = true)
    public boolean addUser(SysUser sysUser) {
        return this.save(sysUser);
    }

    @Override
    @CachePut(value = {"sysUser"}, key = "#entity.id")
    @CacheEvict(value = {"sysUsers"}, allEntries = true)
    public boolean updateById(SysUser entity) {
        return super.updateById(entity);
    }
}
