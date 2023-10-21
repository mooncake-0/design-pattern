package creational.factory.abstract_factory;

import creational.factory.abstract_factory.components.Button;
import creational.factory.abstract_factory.components.CheckBox;
import creational.factory.abstract_factory.components.impl.WindowButton;
import creational.factory.abstract_factory.components.impl.WindowCheckBox;


/*
 각 Family Group 에 맞도록 Component 들을 생성해준다
 */
public class WindowComponentFactory implements ComponentFactory {
    @Override
    public Button createButton(String btnText) {
        return new WindowButton(btnText);
    }

    @Override
    public CheckBox createCheckBox(boolean isChecked) {
        return new WindowCheckBox(isChecked);
    }

}
