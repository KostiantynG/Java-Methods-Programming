package by.bsu.enums;

/**
 *
 */
public enum ShapeWithAnonymousClass {
    RECTANGLE, SQUARE, TRIANGLE { // анонимный класс

        public double computeSquare() { // версия для TRIANGLE
            return this.getA() * this.getB() / 2;
        }
    };
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setShape(double a, double b) {
        if ((a <= 0 || b <= 0) || a != b && this == SQUARE) {
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
    }

    public double computeSquare() { // версия для RECTANGLE и SQUARE
        return a * b;
    }

    public String toString() {
        return name() + "-> a=" + a + ", b=" + b;
    }
}

class EnumRunner {
    public static void main(String[] args) {
        int i = 4;
        for (ShapeWithAnonymousClass f : ShapeWithAnonymousClass.values()) {
            f.setShape(3, i--);
            System.out.println(f + " площадь= " + f.computeSquare());
        }
    }
}