package com.hackerrank.configstyles.service;

public class SmsNotificationService implements NotificationService {

    public SmsNotificationService(String serviceName) {
    }

    public ServiceResponse sendNotification(String notification) {
        return new ServiceResponse("SMS_SERVICE", notification);
    }
}
