package com.crawler.config.datasource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomDataSourceProperties {

    private String url;

    private String username;

    private String password;

    private int maxActive;

    private int minIdle;

    private int maxWait;

    private int initialSize;

    private String validationQuery;

    private boolean testOnBorrow;

    private boolean testOnReturn;

    private boolean testWhileIdle;

    private int timeBetweenEvictionRunsMillis;

    private int minEvictableIdleTimeMillis;

    private String filters;
}
