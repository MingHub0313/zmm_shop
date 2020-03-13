package com.github.zmm.service.redis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.io.Serializable;

/**
 * @Name RedisConfig
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
@Configuration
public class RedisConfig {

	@Value("${spring.redis.database}")
	private int dateBase;
	@Value("${spring.redis.host}")
	private String host;
	@Value("${spring.redis.port}")
	private int port;
	@Value("${spring.redis.password}")
	private String password;
	@Value("${spring.redis.pool.max-active}")
	private int maxTotal;
	@Value("${spring.redis.pool.max-wait}")
	private int maxWait;
	@Value("${spring.redis.pool.max-idle}")
	private int maxIdle;
	@Value("${spring.redis.pool.min-idle}")
	private int minIdle;
	@Value("${spring.redis.timeout}")
	private int timeout;

	@Bean
	public StringRedisSerializer stringSerializer() {
		return new StringRedisSerializer();
	}
	@Bean
	public JdkSerializationRedisSerializer jdkSerializer() {
		return new JdkSerializationRedisSerializer();
	}
	@Bean
	public GenericJackson2JsonRedisSerializer jsonSerializer() {
		return new GenericJackson2JsonRedisSerializer();
	}

	@Bean
	public LettuceConnectionFactory factory(RedisConnectionFactory redisConnectionFactory) {
		/**
		 *  该方法已经过时
		JedisConnectionFactory factory = new JedisConnectionFactory()
		factory.setDatabase(dateBase)
		factory.setHostName(host)
		factory.setPort(port)
		factory.setPassword(password)
		JedisPoolConfig poolConfig = new JedisPoolConfig()
		poolConfig.setMaxIdle(maxIdle)
		poolConfig.setMinIdle(minIdle)
		poolConfig.setMaxWaitMillis(maxWait)
		poolConfig.setMaxTotal(maxTotal)
		factory.setPoolConfig(poolConfig)
		factory.setTimeout(timeout)
		*/
		if (!(redisConnectionFactory instanceof LettuceConnectionFactory)) {
			throw new RuntimeException(
					"un support redis connection factory! " + redisConnectionFactory);
		}
		LettuceConnectionFactory lettuceConnectionFactory = (LettuceConnectionFactory) redisConnectionFactory;

		RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration(
				lettuceConnectionFactory.getHostName(), lettuceConnectionFactory.getPort());
		redisStandaloneConfiguration.setDatabase(dateBase);
		redisStandaloneConfiguration.setPassword(lettuceConnectionFactory.getPassword());
		LettuceConnectionFactory connectionFactory = new LettuceConnectionFactory(
				redisStandaloneConfiguration, lettuceConnectionFactory.getClientConfiguration());
		//这句一定不能少
		connectionFactory.afterPropertiesSet();
		return connectionFactory;
	}

	@Bean
	public RedisTemplate<Serializable, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
		RedisTemplate<Serializable, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(factory(redisConnectionFactory));
		redisTemplate.setKeySerializer(stringSerializer());
		redisTemplate.setValueSerializer(jdkSerializer());
		redisTemplate.setHashKeySerializer(stringSerializer());
		return redisTemplate;
	}
}
