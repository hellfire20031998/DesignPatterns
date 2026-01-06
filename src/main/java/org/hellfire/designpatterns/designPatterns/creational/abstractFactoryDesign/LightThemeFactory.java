package org.hellfire.designpatterns.designPatterns.creational.abstractFactoryDesign;

public class LightThemeFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
