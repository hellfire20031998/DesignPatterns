package org.hellfire.designpatterns.designPatterns.creational.factoryMethodDesign;

public class SmsNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("SMS Notification");
    }
}
