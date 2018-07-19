package com.qinker.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.qinker.miaosha.dao")
public class MiaoShaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiaoShaApplication.class, args);
	}
}
