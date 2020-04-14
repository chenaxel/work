package com.crawler.config.executor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * des
 *
 * @author chenzhaohui
 * @date 2020/4/13
 */
@Configuration
public class ThreadPoolConfig {

	@Bean("threadPoolProperties")
	@ConfigurationProperties("thread.pool")
	public CustomThreadPoolProperties dataSourceOneProperties() {
		return new CustomThreadPoolProperties();
	}


	@Bean
	public ThreadPoolTaskExecutor threadPoolTaskExecutor(@Qualifier("threadPoolProperties") CustomThreadPoolProperties properties) {

		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setMaxPoolSize(properties.getMaxPoolSize());
		executor.setCorePoolSize(properties.getCorePoolSize());
		executor.setWaitForTasksToCompleteOnShutdown(properties.isWaitForTasksToCompleteOnShutdown());
		return executor;
	}
}
