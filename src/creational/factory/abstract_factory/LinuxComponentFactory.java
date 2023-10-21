package creational.factory.abstract_factory;

import creational.factory.abstract_factory.components.Button;
import creational.factory.abstract_factory.components.CheckBox;
import creational.factory.abstract_factory.components.impl.LinuxButton;
import creational.factory.abstract_factory.components.impl.LinuxCheckBox;

public class LinuxComponentFactory implements ComponentFactory {
    @Override
    public Button createButton(String btnText) {
        return new LinuxButton(btnText);
    }

    @Override
    public CheckBox createCheckBox(boolean isChecked) {
        return new LinuxCheckBox(isChecked);
    }
}
