package org.hellfire.designpatterns.designPatterns.creational.abstractFactoryDesign;

public class DarkThemeFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
