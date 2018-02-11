package by.bsu.proj.accountlogic;

/**
 * # 1 # объявление интерфейса управления банковским счетом # AccountAction.java
 */
public interface AccountAction {
    // по умолчанию все методы public abstract
    boolean openAccount(); // объявление сигнатуры метода

    boolean closeAccount();

    void blocking();

    void unBlocking();

    double depositInCash(int accountNumber, int amount);

    boolean withdraw(int accountNumber, int amount);

    boolean convert(double amount);

    boolean transfer(double amount);
}