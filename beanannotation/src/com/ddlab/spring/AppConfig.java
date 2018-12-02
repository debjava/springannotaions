package com.ddlab.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ddlab.spring")
public class AppConfig {
	
	@Bean(name="lenovo")
	public Laptop getLaptop() {
		return new LenovoLaptopImpl();
	}

}
