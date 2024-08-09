package com.project.zizihotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ZiziHotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZiziHotelApplication.class, args);
    }

}
