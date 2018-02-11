package by.bsu.shapes.entity;

/**
 * # 10 # абстрактная фигура, прямоугольник, треугольник
 * # AbstractShape.java # Rectangle.java # Triangle.java
 */
public class Triangle extends AbstractShape {
    private double b;
    private double angle; // угол между сторонами в радианах

    public Triangle(double a, double b, double angle) {
        super(a);
        this.b = b;
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        double c = 0.1; // stub : вычисление по теореме косинусов
        return c;
    }
}