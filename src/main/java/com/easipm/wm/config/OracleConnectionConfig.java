package com.easipm.wm.config;

import java.sql.SQLException;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.beans.factory.annotation.Value;
import oracle.ucp.jdbc.*;


@Configuration

public class OracleConnectionConfig {

	@Value("${spring.datasource.username}") private String userName;
	@Value("${spring.datasource.password}") private String password;
	@Value("${spring.datasource.url}") private String connectionurl;
	@Value("${spring.datasource.driver-class-name}") private String driver;
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConnectionurl() {
		return connectionurl;
	}
	public void setConnectionurl(String connectionurl) {
		this.connectionurl = connectionurl;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	

	public DataSource session() throws SQLException {
		PoolDataSource dataSource = PoolDataSourceFactory.getPoolDataSource();
		dataSource.setUser(userName);
		dataSource.setPassword(password);
		dataSource.setConnectionFactoryClassName(driver);
		dataSource.setURL(connectionurl);
		dataSource.setFastConnectionFailoverEnabled(true);
		dataSource.setInitialPoolSize(5);
		dataSource.setMinPoolSize(5);
		dataSource.setMaxPoolSize(10);
		return dataSource;
		
	}
	
	
}
