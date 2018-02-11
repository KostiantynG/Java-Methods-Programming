package by.bsu.proj.accountlogic;

/**
 * # 3 # операционное управление банковским счетом # AccountOperationManager.java
 */
public interface AccountOperationManager {
    double depositInCash(int accountNumber, int amount);

    boolean withdraw(int accountNumber, int amount);

    boolean convert(double amount);

    boolean transfer(int accountNumber, double amount);
}