package creational.factory.abstract_factory;

import creational.factory.abstract_factory.components.Button;
import creational.factory.abstract_factory.components.CheckBox;

public class OsUser {

    public static void main(String [] args) {

        ComponentFactory factory = new WindowComponentFactory();

        // 이 팩토리를 통해서 원하는 컴포넌트를 어떤 운영체제인지 고민할 필요 없이 생성할 수 있다

        Button button = factory.createButton("버튼입니다");
        CheckBox checkBox = factory.createCheckBox(true);

        button.render();
        checkBox.render();

        // 어찌어찌 해서 Linux 로 바뀌게 되었다

        factory = new LinuxComponentFactory();

        button = factory.createButton("버튼입니다");
        checkBox = factory.createCheckBox(true);

        button.render();
        checkBox.render();
    }
}
