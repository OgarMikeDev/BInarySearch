package org.example.Service;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = (ApplicationContext) SpringApplication.run(Main.class, args);
    }
}
