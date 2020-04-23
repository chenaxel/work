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
@MapperScan(basePackages = "com.crawler.core.dao.product", sqlSessionTemplateRef = "sqlSessionTemplateTwo")
public class SqlSessionTemplateTwoConfig {

	@Bean
	@ConfigurationProperties(prefix = "mybatis.configuration2")
	public org.apache.ibatis.session.Configuration configurationTwo() {
		return new org.apache.ibatis.session.Configuration();
	}

	@Bean("sqlSessionFactoryTwo")
	@Primary
	public SqlSessionFactory sqlSessionFactoryTwo(@Qualifier("dataSourceTwo") DataSource dataSource, @Qualifier("configurationTwo") org.apache.ibatis.session.Configuration configuration) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setEnvironment("datasourceTwo");
		factoryBean.setConfiguration(configuration);
		factoryBean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("classpath:mapper/product/*.xml"));
		return factoryBean.getObject();
	}

	@Bean("sqlSessionTemplateTwo")
	public SqlSessionTemplate sqlSessionTemplateTwo(@Qualifier("sqlSessionFactoryTwo") SqlSessionFactory sqlSessionFactoryTwo) {
		return new SqlSessionTemplate(sqlSessionFactoryTwo);
	}

}
