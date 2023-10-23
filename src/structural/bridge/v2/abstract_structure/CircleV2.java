package structural.bridge.v2.abstract_structure;

import structural.bridge.v2.implementation_structure.Drawing;

public class CircleV2 extends ShapeV2 {

    private double x1;
    private double y1;
    private double r;

    public CircleV2(Drawing drawingTool, double x1, double y1, double r) {
        super(drawingTool);
        this.x1 = x1;
        this.y1 = y1;
        this.r = r;
    }

    @Override
    public void draw() {
        super.drawingTool.drawCircle(this.x1, this.y1, this.r);
    }
}
