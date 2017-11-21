package com.yidu.cms_java_read;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
public class CmsJavaReadApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsJavaReadApplication.class, args);
	}
}
