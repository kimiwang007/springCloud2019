package com.atguigu.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration		
public class ConfigBean {//boot --> applicationContext.xml -- @Configuration配置
	
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
//	@Bean
//	public UserService getUserService(){
//		return new UserServiceImpl();
//	}