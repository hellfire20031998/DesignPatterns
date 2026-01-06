package org.hellfire.designpatterns.designPatterns.creational.abstractFactoryDesign;

public class DarkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Dark Checkbox");
    }
}
