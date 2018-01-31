package by.bsu.creator;

import by.bsu.point.Point3D;

/**
 * # 7 # методы-подставки # Point1DCreator.java # Point2DCreator.java
 * #Point3DCreator.java # BuildRunner.java
 */
public class Point3DCreator extends Point2DCreator {
    @Override
    public Point3D createPoint() { // метод - подставка
        System.out.println("Point3D");
        return new Point3D(3, 7, 8);
    }
}