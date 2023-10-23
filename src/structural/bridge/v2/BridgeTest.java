package structural.bridge.v2;

import structural.bridge.v2.abstract_structure.CircleV2;
import structural.bridge.v2.abstract_structure.RectangleV2;
import structural.bridge.v2.abstract_structure.ShapeV2;
import structural.bridge.v2.implementation_structure.Drawing;
import structural.bridge.v2.implementation_structure.V1Drawing;
import structural.bridge.v2.implementation_structure.V2Drawing;

import java.util.ArrayList;
import java.util.List;

public class BridgeTest {

    public static void main(String[] args) {

        // 역할체가 필요 // 구현체를 주입
        // 사용할 Drawing Tool 은 사전에 원하는 방식대로 주입시켜준 상태이다
        Drawing drawingTool = new V1Drawing();
        Drawing drawingTool2 = new V2Drawing();

        // Client 는 역할을 가져온다 (어떤 것을 그릴지 선택)
        ShapeV2 shape = new RectangleV2(drawingTool, 1, 1, 2, 2); // V1 Line 을 그린다
        ShapeV2 anotherShape = new CircleV2(drawingTool2, 6, 6, 2); // V2 Circle 을 그린다
        List<ShapeV2> shapes = List.of(shape, anotherShape);

        for (ShapeV2 s : shapes) {
            System.out.println("DRAW EVERY SHAPE");
            s.draw();
        }
    }
}
