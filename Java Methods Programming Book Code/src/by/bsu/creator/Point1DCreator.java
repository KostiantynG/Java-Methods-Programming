package by.bsu.creator;

import by.bsu.point.Point1D;

/**
 * # 7 # методы-подставки # Point1DCreator.java # Point2DCreator.java
 * #Point3DCreator.java # BuildRunner.java
 */
public class Point1DCreator {
    public Point1D createPoint() {
        System.out.println("Point1D");
        return new Point1D(1);
    }
}