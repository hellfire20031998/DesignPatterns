package org.hellfire.designpatterns.designPatterns.creational.abstractFactoryDesign;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Dark Button");
    }
}
