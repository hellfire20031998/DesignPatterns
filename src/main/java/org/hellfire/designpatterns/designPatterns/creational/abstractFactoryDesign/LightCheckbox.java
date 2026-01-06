package org.hellfire.designpatterns.designPatterns.creational.abstractFactoryDesign;

public class LightCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Light Checkbox");
    }
}
