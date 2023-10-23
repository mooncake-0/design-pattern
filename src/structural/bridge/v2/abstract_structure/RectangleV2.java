package structural.bridge.v2.abstract_structure;

import org.w3c.dom.css.Rect;
import structural.bridge.v2.implementation_structure.Drawing;

public class RectangleV2 extends ShapeV2{

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public RectangleV2(Drawing drawingTool, double x1, double y1, double x2, double y2) {
        super(drawingTool);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        super.drawingTool.drawLine(this.x1, this.y1, this.x2, this.y2);
    }
}
