package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookManagementSystemApplication.class, args);
	}
	
//	 @Bean
//	    public ViewResolver viewResolver() {
//	         final InternalResourceViewResolver r = new InternalResourceViewResolver();
//	         r.setPrefix("/WEB-INF/views/");
//	         r.setSuffix(".jsp");
//	         return r;
//	    }

}
