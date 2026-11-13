package org.jecrcf;

import java.util.List;

import org.jecrcf.notification.EmailNotification;
import org.jecrcf.notification.NotificationService;
import org.jecrcf.notification.SmsNotification;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public NotificationService emailNotification() {
        return new EmailNotification();
    }

    @Bean
    public NotificationService smsNotification() {
        return new SmsNotification();
    }

    @Bean
    public EventRegistrationService eventRegistrationService(
            List<NotificationService> notificationServices) {

        return new EventRegistrationService(notificationServices);
    }
}

