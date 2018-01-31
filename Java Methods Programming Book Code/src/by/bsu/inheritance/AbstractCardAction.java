package by.bsu.inheritance;

/**
 * # 9 # абстрактный класс и метод # AbstractCardAction.java
 */
public abstract class AbstractCardAction {
    private int id;

    public AbstractCardAction() { // конструктор
    }

    // more methods
    public boolean checkLimit() { // собственный метод
        return true; // stub
    }

    public abstract void doPayment(double amountPayment);
}