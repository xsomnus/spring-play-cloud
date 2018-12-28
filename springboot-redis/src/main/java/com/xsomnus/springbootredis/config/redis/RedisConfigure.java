package com.xsomnus.springbootredis.config.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author somnus_xiawenye
 * @since 2018/11/29 0029 9:50
 */
@Configuration
@EnableCaching
public class RedisConfigure extends CachingConfigurerSupport {

    @Autowired
    RedisConnectionFactory redisConnectionFactory;

 /*   @Autowired
    CacheManager cacheManager;*/


    @Bean
    public KeyGenerator wiselyKeyGenerator() {
        return (target, method, params) -> target.getClass().getSimpleName() + ":" + method.getName() + ":" + Stream.of(params).map(String::valueOf).collect(Collectors.joining("_"));
    }

    private RedisCacheConfiguration redisCacheConfiguration() {
        Duration duration = Duration.ofSeconds(3600L);
        return RedisCacheConfiguration.defaultCacheConfig().entryTtl(duration);
    }


    @Bean
    public CacheManager cacheManager(@SuppressWarnings("rawtypes") RedisTemplate redisTemplate) {
        return new RedisCacheManager(RedisCacheWriter.nonLockingRedisCacheWriter(Objects.requireNonNull(redisTemplate.getConnectionFactory())), redisCacheConfiguration());
    }

 /*   @Bean
    public CacheResolver cacheResolver() {
        return new CustomCacheResolver(cacheManager);
    }
*/

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        template.setKeySerializer(new StringRedisSerializer());
        GenericJackson2JsonRedisSerializer jackson2JsonRedisSerializer = new GenericJackson2JsonRedisSerializer();
        template.setDefaultSerializer(jackson2JsonRedisSerializer);
        template.afterPropertiesSet();
        return template;
    }
}
