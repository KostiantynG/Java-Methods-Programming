package by.bsu.transfer;

import by.bsu.transfer.bean.Account;

/**
 * # 3 # перевод денег со счета на счет # TransferAction.java
 */
public class TransferAction {
    private double transactionAmount;

    public TransferAction(double amount) { // конструктор по умолчанию не предоставляется
        if (amount > 0) {
            this.transactionAmount = amount;
        } else {
            throw new IllegalArgumentException(); // или собственное исключение
        }
    }

    public boolean transferIntoAccount(Account from, Account to) {
        // определение остатка
        double demand = from.getAmount() - transactionAmount;
        // проверка остатка и перевод суммы
        if (demand >= 0) {
            from.addAmount(demand);
            to.addAmount(transactionAmount);
            return true;
        } else {
            return false;
        }
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }
    // вставить метод удержания процента при переводе
}
//
///**
// * # 5 # статические метод и поле # TransferAction.java
// */
//public class TransferAction {
//    public static double transactionAmount; // статическое поле
//    private int id; // нестатическое поле
//
//    public static boolean transferIntoAccount(Account from, Account to) {
//// increaseAmount(); // вызвать нельзя – объекта не существует
//// this.id // использовать this невозможно – объекта не существует
//// id // недоступен – объекта не существует
//// определение остатка
//        double demand = from.getAmount() - transactionAmount;
//// проверка остатка и перевод суммы
//        if (demand >= 0) {
//            from.addAmount(demand);
//            to.addAmount(transactionAmount);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void increaseAmount() { // нестатический метод
//        transactionAmount++;
//    }
//}