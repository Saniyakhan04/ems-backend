package com.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmsApplication {

	public static void main(String[] args) {
        SpringApplication.run(EmsApplication.class, args);

        
        System.out.println("ENCODED PASSWORD: " +
                new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder().encode("1234"));
    }

}
