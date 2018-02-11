package by.bsu.shapes.entity;

/**
 * # 10 # абстрактная фигура, прямоугольник, треугольник
 * # AbstractShape.java # Rectangle.java # Triangle.java
 */
public class Rectangle extends AbstractShape {
    private double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }
}