package by.bsu.shapes.action;

import by.bsu.shapes.entity.AbstractShape;

/**
 * # 12 # параметризация интерфейса # IShapeAction.java
 */
public interface IShapeActionParam <T extends AbstractShape> {
    double computeSquare(T shape);
    double computePerimeter(T shape);
}