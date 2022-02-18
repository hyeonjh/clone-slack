package com.sparta.clonecodingslack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ClonecodingSlackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClonecodingSlackApplication.class, args);
    }

}
