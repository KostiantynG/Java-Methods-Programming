package by.bsu.inheritance;

/**
 * # 10 # подкласс абстрактного класса # CreditCardAction.java # Runner.java
 */
public class CreditCardActionExtendsACA extends AbstractCardAction {
    // поля, конструкторы, методы
    @Override // аннотация указывает на полиморфную природу метода
    // метод должен быть реализован в подклассе
    public void doPayment(double amountPayment) { // переопределенный метод
    // реализация
        System.out.println("complete from credit card!");
    }
}