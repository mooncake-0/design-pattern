package creational.factory.abstract_factory.components;

public abstract class Button {

    protected String btnText;

    public Button(String btnText) {
        this.btnText = btnText;
    }

    public void clickEvent() {
        System.out.println(btnText + " 버튼을 클릭");
    }

    // 화면상 Component 를 그린다
    // 운영체제에 따라서 Rendering 하는 동작 방식이 달라진다
    public abstract void render();

}
