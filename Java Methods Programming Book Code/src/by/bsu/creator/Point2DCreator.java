package by.bsu.creator;

import by.bsu.point.Point2D;

/**
 * # 7 # методы-подставки # Point1DCreator.java # Point2DCreator.java
 * #Point3DCreator.java # BuildRunner.java
 */
public class Point2DCreator extends Point1DCreator {
    @Override
    public Point2D createPoint() { // метод - подставка
        System.out.println("Point2D");
        return new Point2D(2, 5);
    }
}