package com.librarymanager.NotificationService;

import java.util.function.Consumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Configuration
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}
	@Bean
	public Consumer<String> consumerBinding(){
		return message ->{
			System.out.println("Mesage:"+message);
			System.out.println("Mesage:"+message);
			System.out.println("Mesage:"+message);
		};
	}
}
