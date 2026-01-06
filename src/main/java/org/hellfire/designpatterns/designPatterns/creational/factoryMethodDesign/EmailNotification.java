package org.hellfire.designpatterns.designPatterns.creational.factoryMethodDesign;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Email Notification");
    }
}
