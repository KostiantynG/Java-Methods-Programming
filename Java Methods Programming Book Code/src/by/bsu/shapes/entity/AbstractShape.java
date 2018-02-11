package by.bsu.shapes.entity;

/**
 * # 10 # абстрактная фигура, прямоугольник, треугольник
 * # AbstractShape.java # Rectangle.java # Triangle.java
 */
public abstract class AbstractShape {
    private double a;

    public AbstractShape(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
}