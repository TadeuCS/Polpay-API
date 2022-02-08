package br.com.tcs.polpay.api.core.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = "br.com.tcs.polpay.api.*.*")
public class PolPayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolPayApiApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//		};
//	}

}
