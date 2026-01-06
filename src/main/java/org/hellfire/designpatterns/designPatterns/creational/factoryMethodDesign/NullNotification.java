package org.hellfire.designpatterns.designPatterns.creational.factoryMethodDesign;

public class NullNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Cannot send notification to Null Notification");
    }
}
