package creational.factory.abstract_factory;

import creational.factory.abstract_factory.components.Button;
import creational.factory.abstract_factory.components.CheckBox;

/*
 추상 Component 를 생성해주는
 추상 Factory Class 이다
 */
public interface ComponentFactory {

    /*
     생성하려고자 하는 Component 묶음에는 생성에 필요한 필드들이 같이 들어가있다
     */
    Button createButton(String btnText);

    CheckBox createCheckBox(boolean isChecked);
}
