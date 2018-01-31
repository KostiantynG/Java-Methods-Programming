package by.bsu.point;

/**
 * # 5 # super и this в конструкторе # Point1D.java # Point2D.java # Point3D.java
 * # 6 # динамическое связывание методов # Point1D.java # Point2D.java # Point3D.java
 * # PointReport.java # Runner.java
 */
public class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        this(-1, -1, -1); // вызов конструктора Point3D с параметрами
    }

    @Override
    public double length() {
        return Math.hypot(super.length(), z);
    }

    @Override
    public String toString() {
        return super.toString() + " z=" + z;
    }
}