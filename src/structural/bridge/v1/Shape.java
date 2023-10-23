package structural.bridge.v1;


// Shape 이라는 역할체 마다 각자의 draw 를 사용할 수 있도록 polymorphism 을 적용해준다
public abstract class Shape {
    abstract public void draw();
}

abstract class Circle extends Shape {
    public void draw(double x, double y, double r){
        drawCircle(x,y,r);
    }

    protected abstract void drawCircle(double x, double y, double r);
}

abstract class Rectangle extends Shape {
    public void draw(double x1, double y1, double x2, double y2){
        drawLine(x1,y1,x2,y2);
        // .. draw more Lines
    }

    protected abstract void drawLine(double x1, double y1, double x2, double y2);
}
