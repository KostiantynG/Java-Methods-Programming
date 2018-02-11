package by.bsu.shapes;

import by.bsu.shapes.action.IShapeActionParam;
import by.bsu.shapes.action.RectangleActionParam;
import by.bsu.shapes.action.TriangleActionParam;
import by.bsu.shapes.entity.Rectangle;
import by.bsu.shapes.entity.Triangle;

import static java.lang.Math.PI;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectShape = new Rectangle(2, 3);
        IShapeActionParam<Rectangle> rectAction = new RectangleActionParam();
        Triangle trShape = new Triangle(3, 4, PI / 6);
        IShapeActionParam<Triangle> trAction = new TriangleActionParam();
        System.out.println("Square rectangle: " + rectAction.computeSquare(rectShape));
        System.out.println("Perimeter rectangle: " + rectAction.computePerimeter(rectShape));
        System.out.println("Square triangle: " + trAction.computeSquare(trShape));
        System.out.println("Perimeter triangle: " + trAction.computePerimeter(trShape));
        //trAction.computePerimeter(rectShape); // ошибка компиляции
    }
}