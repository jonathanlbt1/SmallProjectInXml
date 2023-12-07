package com.hackerrank.configstyles.service;

public class ThirdPartyNotificationService implements NotificationService {
    private final String thirdPartyNotificationService;

    public ThirdPartyNotificationService(String serviceName) {
        this.thirdPartyNotificationService = serviceName;
    }

    public ServiceResponse sendNotification(String notification) {
        return new ServiceResponse(thirdPartyNotificationService, notification);
    }

}
