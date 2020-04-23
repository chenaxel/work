package com.crawler.config.datasource;

import com.alibaba.druid.pool.xa.DruidXADataSource;
import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.sql.DataSource;
import javax.transaction.UserTransaction;
import java.sql.SQLException;


@Configuration
public class BaseDataSourceConfig {

	@Bean("dataSourceOneProperties")
	@ConfigurationProperties("spring.datasource.druid.one")
	public CustomDataSourceProperties dataSourceOneProperties() {
		return new CustomDataSourceProperties();
	}


	@Bean("dataSourceTwoProperties")
	@ConfigurationProperties("spring.datasource.druid.two")
	public CustomDataSourceProperties dataSourceTwoProperties() {
		return new CustomDataSourceProperties();
	}

	@Bean("dataSourceThreeProperties")
	@ConfigurationProperties("spring.datasource.druid.three")
	public CustomDataSourceProperties dataSourceThreeProperties() {
		return new CustomDataSourceProperties();
	}

	@Bean
	@Primary
	public DataSource dataSourceOne(@Qualifier("dataSourceOneProperties") CustomDataSourceProperties properties) throws SQLException {
		return configureDataSource(properties);
	}

	@Bean
	public DataSource dataSourceTwo(@Qualifier("dataSourceTwoProperties") CustomDataSourceProperties properties) throws SQLException {
		return configureDataSource(properties);
	}

	@Bean
	public DataSource dataSourceThree(@Qualifier("dataSourceThreeProperties") CustomDataSourceProperties properties) throws SQLException {
		return configureDataSource(properties);
	}

	@Bean(name = "jtaTransactionManager")
	@Primary
	public JtaTransactionManager jtaTransactionManager() {
		UserTransactionManager userTransactionManager = new UserTransactionManager();
		UserTransaction userTransaction = new UserTransactionImp();
		return new JtaTransactionManager(userTransaction, userTransactionManager);
	}

	private DataSource configureDataSource(CustomDataSourceProperties properties) throws SQLException {
		AtomikosDataSourceBean dataSourceBean = new AtomikosDataSourceBean();
		DruidXADataSource xaDataSource = new DruidXADataSource();
		xaDataSource.setUrl(properties.getUrl());
		xaDataSource.setUsername(properties.getUsername());
		xaDataSource.setPassword(properties.getPassword());
		xaDataSource.setInitialSize(properties.getInitialSize());
		xaDataSource.setMaxActive(properties.getMaxActive());
		xaDataSource.setMinIdle(properties.getMinIdle());
		xaDataSource.setMaxWait(properties.getMaxWait());
		xaDataSource.setValidationQuery(properties.getValidationQuery());
		xaDataSource.setTestOnBorrow(properties.isTestOnBorrow());
		xaDataSource.setTestOnReturn(properties.isTestOnReturn());
		xaDataSource.setTestWhileIdle(properties.isTestWhileIdle());
		xaDataSource.setFilters(properties.getFilters());
		xaDataSource.setTimeBetweenEvictionRunsMillis(properties.getTimeBetweenEvictionRunsMillis());
		xaDataSource.setMinEvictableIdleTimeMillis(properties.getMinEvictableIdleTimeMillis());
		dataSourceBean.setXaDataSource(xaDataSource);
		return dataSourceBean;
	}
}
