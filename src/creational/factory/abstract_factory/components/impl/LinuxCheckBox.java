package creational.factory.abstract_factory.components.impl;

import creational.factory.abstract_factory.components.CheckBox;

public class LinuxCheckBox extends CheckBox {


    public LinuxCheckBox(boolean isChecked) {
        super(isChecked);
    }

    @Override
    public void render() {
        System.out.println("Linux Rendering 기술을 이용해 체크박스를 보여줍니다");
    }
}
