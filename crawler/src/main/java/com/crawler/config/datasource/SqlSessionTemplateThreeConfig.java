package com.crawler.config.datasource;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.crawler.core.dao.ms", sqlSessionTemplateRef = "sqlSessionTemplateThree")
public class SqlSessionTemplateThreeConfig {

	@Bean
	@ConfigurationProperties(prefix = "mybatis.configuration3")
	public org.apache.ibatis.session.Configuration configurationThree() {
		return new org.apache.ibatis.session.Configuration();
	}

	@Bean("sqlSessionFactoryThree")
	@Primary
	public SqlSessionFactory sqlSessionFactoryThree(@Qualifier("dataSourceThree") DataSource dataSource, @Qualifier("configurationThree") org.apache.ibatis.session.Configuration configuration) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setEnvironment("datasourceThree");
		factoryBean.setConfiguration(configuration);
		factoryBean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("classpath:mapper/ms/*.xml"));
		return factoryBean.getObject();
	}

	@Bean("sqlSessionTemplateThree")
	public SqlSessionTemplate sqlSessionTemplateThree(@Qualifier("sqlSessionFactoryThree") SqlSessionFactory sqlSessionFactoryThree) {
		return new SqlSessionTemplate(sqlSessionFactoryThree);
	}

}
