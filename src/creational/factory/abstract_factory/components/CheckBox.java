package creational.factory.abstract_factory.components;

public abstract class CheckBox {

    protected boolean isChecked;

    public CheckBox(boolean isChecked) {
        this.isChecked = isChecked;
        render();
    }

    void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
        render(); // 체크 모습 렌더링
    }

    public abstract void render();
}
