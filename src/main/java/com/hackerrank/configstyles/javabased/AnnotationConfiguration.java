package com.hackerrank.configstyles.javabased;

import com.hackerrank.configstyles.service.EmailNotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfiguration {

    @Bean
    public EmailNotificationService emailNotificationService() {
        return new EmailNotificationService("EMAIL_SERVICE");
    }
}
