package by.bsu.proj.accountlogic;

/**
 * # 4 # реализация общего управления банковским счетом
 * # AccountBaseActionImpl.java
 */
public class AccountBaseActionImpl implements AccountBaseAction {
    public boolean openAccount() {
        // more code
        return true;
    }

    public boolean closeAccount() {
        // more code
        return true;
    }

    public void blocking() {
        throw new UnsupportedOperationException(); // лучше собственное исключение
        }

    public void unBlocking() {
        // more code
    }
}