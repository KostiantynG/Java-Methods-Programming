package by.bsu.point;

/**
 * # 5 # super и this в конструкторе # Point1D.java # Point2D.java # Point3D.java
 * # 6 # динамическое связывание методов # Point1D.java # Point2D.java # Point3D.java
 * # PointReport.java # Runner.java
 */
public class Point2D extends Point1D {
    private int y;
    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override

    public double length() {
        return Math.hypot(super.length(), y);
/* просто length() нельзя, т.к. метод будет вызывать сам себя, что
приведет к бесконечной рекурсии и ошибке во время выполнения */
    }
    @Override
    public String toString() {
        return super.toString() + " y=" + y;
    }
}