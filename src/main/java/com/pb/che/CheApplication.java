package com.pb.che;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@ComponentScan(basePackages =
{ "com.pb.che" }) // 扫描该包路径下的所有spring组件
@EnableJpaRepositories("com.pb.che.repository") // JPA扫描该包路径下的Repositorie
@EntityScan("com.pb.che.entity") // 扫描实体类
@Controller
public class CheApplication
{

	public static void main(String[] args)
	{

		SpringApplication.run(CheApplication.class, args);

	}
}
