package org.hellfire.designpatterns.designPatterns.creational.abstractFactoryDesign;

public class Application {
    private Button button;
    public Checkbox checkbox;

    public Application(UIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void display() {
        button.render();
        checkbox.render();
    }
}
