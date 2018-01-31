package by.bsu.point;

/**
 * # 5 # super и this в конструкторе # Point1D.java # Point2D.java # Point3D.java
 * # 6 # динамическое связывание методов # Point1D.java # Point2D.java # Point3D.java
 * # PointReport.java # Runner.java
 */
public class Point1D {
    private int x;

    public Point1D(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public double length() {
        return Math.abs(x);
    }

    @Override
    public String toString() {
        return " x=" + x;
    }
}