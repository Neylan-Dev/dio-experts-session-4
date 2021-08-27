package one.digitalinnovation.experts.shoppingcart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableRedisRepositories
public class RedisConfig {


    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {

        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("localhost", 6379));
    }

//    @Bean
//    public JedisConnectionFactory redisConnectionFactory() {
//        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("localhost", 6379);
//        return new JedisConnectionFactory(config);
//    }
//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate(){
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(redisConnectionFactory());
//        return redisTemplate;
//    }
}
