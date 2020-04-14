package com.crawler.config.executor;

import lombok.Data;

/**
 * des
 *
 * @author chenzhaohui
 * @date 2020/4/13
 */
@Data
public class CustomThreadPoolProperties {

	private int corePoolSize;
	private int maxPoolSize;
	private boolean waitForTasksToCompleteOnShutdown;
}
