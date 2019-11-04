package com.java158.hrzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableZuulProxy
public class HrZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrZuulApplication.class, args);
	}

	@Bean //处理跨域请求的问题
	public org.springframework.web.filter.CorsFilter corsFilter(){
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowCredentials(true);
		configuration.addAllowedOrigin("*"); //允许的目标IP地址
		configuration.addAllowedHeader("*"); //允许的头部信息
		configuration.addAllowedMethod("*"); //允许的请求类型（POST、GET....）
		//configuration.setMaxAge(18000L);

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return new CorsFilter(source);
	}

}
