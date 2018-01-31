package by.bsu.creator;

import by.bsu.point.Point2D;

/**
 * # 7 # методы-подставки # Point1DCreator.java # Point2DCreator.java
 * #Point3DCreator.java # BuildRunner.java
 */
public class BuildRunner {
    public static void main(String[] args) {
        Point2DCreator br = new Point3DCreator();
        //Point3D p = br.createPoint(); // ошибка компиляции
        Point2D p = br.createPoint(); // "раннее связывание"
        System.out.println(br.createPoint().getX());
        System.out.println(br.createPoint().getY());
        // System.out.println(br.createPoint().z);
    }
}