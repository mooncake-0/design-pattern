package creational.factory.abstract_factory.components.impl;

import creational.factory.abstract_factory.components.Button;

public class WindowButton extends Button {

    public WindowButton(String btnText){
        super(btnText);
    }

    @Override
    public void render() {
        System.out.println("Windows Rendering 기술을 이용해 버튼을 보여줍니다");
    }
}
