package com.kctec.director;

import com.kctec.director.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.kctec.director,com.kctec.director.repositories"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class ApplicationInit {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationInit.class, args);
	}
}
