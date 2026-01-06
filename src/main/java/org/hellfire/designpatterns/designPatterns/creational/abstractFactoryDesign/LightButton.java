package org.hellfire.designpatterns.designPatterns.creational.abstractFactoryDesign;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Light Button");
    }
}
