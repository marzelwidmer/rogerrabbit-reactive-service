package ch.keepcalm.microservice.rr.reactive;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class RogerrabbitReactiveServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RogerrabbitReactiveServiceApplication.class, args);
	}
}
