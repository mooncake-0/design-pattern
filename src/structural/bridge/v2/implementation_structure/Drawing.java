package structural.bridge.v2.implementation_structure;

public interface Drawing {

    // 각 역할체들을 위한 Drawing Tool 제공해준다
    // 인터페이스가 많이 바뀌어야 할 듯..?

    void drawLine(double x1, double y1, double x2, double y2);

    void drawCircle(double x1, double y1, double r);

}
