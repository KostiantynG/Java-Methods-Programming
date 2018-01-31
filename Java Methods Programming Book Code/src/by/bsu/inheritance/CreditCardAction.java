package by.bsu.inheritance;

/**
 * # 1 # наследование класса и переопределение метода
 * # CardAction.java #CreditCardAction.java # CardRunner.java
 */
public class CreditCardAction extends CardAction {
    // поля, конструкторы, методы
    public boolean checkCreditLimit() { // собственный метод
        return true; // stub
    }

    @Override // аннотация указывает на полиморфную природу метода
    public void doPayment(double amountPayment) { // переопределенный метод
// реализация
        System.out.println("complete from credit card");
    }
}