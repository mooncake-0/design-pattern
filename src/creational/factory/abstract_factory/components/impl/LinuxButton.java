package creational.factory.abstract_factory.components.impl;

import creational.factory.abstract_factory.components.Button;

public class LinuxButton extends Button {

    public LinuxButton(String btnText) {
        super(btnText);
    }

    @Override
    public void render() {
        System.out.println("Linux Rendering 기술을 이용해 버튼을 보여줍니다");
    }
}
