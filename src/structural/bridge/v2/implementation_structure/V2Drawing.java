package structural.bridge.v2.implementation_structure;

public class V2Drawing implements Drawing {
    @Override
    public void drawLine(double x1, double y1, double x2, double y2) {
        System.out.println("draw upgraded version of line from (x1, y1) to (x2,y2)");
    }

    @Override
    public void drawCircle(double x1, double y1, double r) {
        System.out.println("draw upgraded version of circle of radius r from (x1,y1)");
    }
}
