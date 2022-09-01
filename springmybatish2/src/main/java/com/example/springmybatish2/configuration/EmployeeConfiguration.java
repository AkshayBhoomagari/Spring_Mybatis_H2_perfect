//package com.example.springmybatish2.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//@Configuration
//public class EmployeeConfiguration extends WebMvcConfigurerAdapter {
//
//		@Bean
//		public ViewResolver viewResolver() {
//			InternalResourceViewResolver bean=new InternalResourceViewResolver();
//			
//			bean.setPrefix("/WEB_INF/jsp/");
//			bean.setSuffix(".jsp");
//			bean.setOrder(0);
//			
//			return bean;
//		}
//}
//this configuration is done in application.properties.....