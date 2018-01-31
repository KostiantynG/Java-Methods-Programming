package by.bsu.inheritance;

/**
 * # 10 # подкласс абстрактного класса # CreditCardAction.java # Runner.java
 */
public class Runner {
    public static void main(String[] args) {
        AbstractCardAction action; // можно объявить ссылку
        // action = new AbstractCardAction(); нельзя создать объект!
        action = new CreditCardActionExtendsACA();
        action.doPayment(100);
    }
}