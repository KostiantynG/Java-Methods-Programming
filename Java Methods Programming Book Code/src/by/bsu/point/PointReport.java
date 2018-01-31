package by.bsu.point;

/**
 * # 6 # динамическое связывание методов # Point1D.java # Point2D.java # Point3D.java
 * # PointReport.java # Runner.java
 */
public class PointReport {
    public void printReport(Point1D p) {
        System.out.printf("length=%.2f %s%n", p.length(), p);
        // вызовы out.print(p.toString()) и out.print(p) для объекта идентичны !
    }
}