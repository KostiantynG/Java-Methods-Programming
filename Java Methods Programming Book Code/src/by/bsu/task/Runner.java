package by.bsu.task;

import by.bsu.task.action.Multiplicator;
import by.bsu.task.creator.MatrixCreator;
import by.bsu.task.entity.Matrix;
import by.bsu.task.exceptions.MatrixException;

/**
 * # 27 # класс, запускающий приложение # Runner.java
 */
public class Runner {
    public static void main(String[] args) {
        try {
            Matrix p = new Matrix(2, 3);
            MatrixCreator.fillRandomized(p, 2, 8);
            System.out.println("Matrix first is: " + p);
            Matrix q = new Matrix(3, 4);
            MatrixCreator.fillRandomized(q, 2, 7);
            System.out.println("Matrix second is: " + q);
            Multiplicator mult = new Multiplicator();

            System.out.println("Matrices product is " + mult.multiply(p, q));
        } catch (MatrixException ex) {
            System.err.println("Error of creating matrix " + ex);


        }
        System.out.println("********************************************");
        try {
            Matrix p = new Matrix(2, 3);
            p.setElement(0, 0, 3);
            p.setElement(0, 1, 4);
            p.setElement(0, 2, 7);
            p.setElement(1, 0, 4);
            p.setElement(1, 1, 7);
            p.setElement(1, 2, 2);
            System.out.println("Matrix first is: " + p);

            Matrix q = new Matrix(3, 4);
            q.setElement(0, 0, 3);
            q.setElement(0, 1, 3);
            q.setElement(0, 2, 6);
            q.setElement(0, 3, 6);
            q.setElement(1, 0, 5);
            q.setElement(1, 1, 6);
            q.setElement(1, 2, 5);
            q.setElement(1, 3, 5);
            q.setElement(2, 0, 4);
            q.setElement(2, 1, 3);
            q.setElement(2, 2, 3);
            q.setElement(2, 3, 4);

            System.out.println("Matrix second is: " + q);
            Multiplicator mult = new Multiplicator();

            System.out.println("Matrices product is " + mult.multiply(p, q));
        } catch (MatrixException ex) {
            System.err.println("Error of creating matrix " + ex);
        }
    }
}