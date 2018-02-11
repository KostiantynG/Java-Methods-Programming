package by.bsu.proj.accountlogic;

/**
 * # 2 # общее управление банковским счетом # AccountBaseAction.java
 */
public interface AccountBaseAction {
    boolean openAccount();

    boolean closeAccount();

    void blocking();

    void unBlocking();
}