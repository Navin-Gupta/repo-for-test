package com.training.unit_test_app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	//expose the product Service bean
	@Bean
	public ProductService getProductService() {
		return new ProductServiceImpl();
	}
}
