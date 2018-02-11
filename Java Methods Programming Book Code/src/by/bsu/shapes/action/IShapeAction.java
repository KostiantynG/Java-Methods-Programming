package by.bsu.shapes.action;

import by.bsu.shapes.entity.AbstractShape;

/**
 * # 6 # наследование интерфейсов # IShapeAction.java
 */
public interface IShapeAction extends ILineGroupAction {
    double computeSquare(AbstractShape shape);
}