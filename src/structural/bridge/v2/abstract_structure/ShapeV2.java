package structural.bridge.v2.abstract_structure;

import structural.bridge.v2.implementation_structure.Drawing;

public abstract class ShapeV2 {
    protected Drawing drawingTool;
    public ShapeV2(Drawing drawingTool) {
        this.drawingTool = drawingTool;
    }
    public abstract void draw();
}
