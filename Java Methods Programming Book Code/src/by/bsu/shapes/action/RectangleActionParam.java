package by.bsu.shapes.action;

import by.bsu.shapes.entity.Rectangle;

/**
 * # 13 # реализация интерфейса с указанием типа параметра
 * # RectangleAction.java
 * # TriangleAction.java
 */
public class RectangleActionParam implements IShapeActionParam<Rectangle> {
    @Override
    public double computeSquare(Rectangle shape) {
        return shape.getA() * shape.getB();
    }

    @Override
    public double computePerimeter(Rectangle shape) {
        return 2 * (shape.getA() + shape.getB());
    }
}