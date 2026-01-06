package org.hellfire.designpatterns.designPatterns.creational.factoryMethodDesign;

public class NotificationFactory {

    public static Notification createNotification(String type) {
        if ("email".equalsIgnoreCase(type)) {
            return new EmailNotification();
        }else if("sms".equalsIgnoreCase(type)) {
            return new SmsNotification();
        }else{
            return new NullNotification();
        }
    }
}
