package com.xsomnus.springbootredis.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xsomnus.springbootredis.mapper.SysUserMapper;
import com.xsomnus.springbootredis.pojo.entity.SysUser;
import com.xsomnus.springbootredis.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisStringCommands;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author somnus_xiawenye
 * @since 2018/10/11 0011 18:07
 */
@Slf4j
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {


    @Autowired
    StringRedisTemplate stringRedisTemplate;

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

    private final byte[] userId = "sysUserId".getBytes();
    @Override
    @CacheEvict(value = {"sysUsers"}, allEntries = true)
    public boolean addUser() {

     /*   RedisStringCommands execute = stringRedisTemplate.execute(RedisConnection::stringCommands);
        Long aLong = execute.incrBy(userId, 1);*/
        SysUser build = SysUser.builder()
//                .id(aLong)
                .username(RandomUtil.randomString(12))
                .avatar(RandomUtil.randomString(12))
                .deptId(RandomUtil.randomLong())
                .password(RandomUtil.randomString(10))
                .telephone(RandomUtil.randomNumbers(11))
                .build();
        return this.save(build);
    }

    @Override
    @CachePut(value = {"sysUser"}, key = "#entity.id")
    @CacheEvict(value = {"sysUsers"}, allEntries = true)
    public boolean updateById(SysUser entity) {
        return super.updateById(entity);
    }
}
