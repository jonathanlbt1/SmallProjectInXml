package com.hackerrank.configstyles;

import com.hackerrank.configstyles.javabased.AnnotationConfiguration;
import com.hackerrank.configstyles.service.EmailNotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml_based_bean_configuration.xml")) {
            System.out.println(context.getBean("thirdPartyNotificationService"));
        }
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfiguration.class)) {
            EmailNotificationService emailNotificationService = context.getBean(EmailNotificationService.class);

        }
    }
}
