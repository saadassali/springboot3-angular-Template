package com.sassali;

import com.divide.by.zero.security.annotation.EnableSecurityModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSecurityModule
public class BookingsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingsystemApplication.class, args);
    }

}
