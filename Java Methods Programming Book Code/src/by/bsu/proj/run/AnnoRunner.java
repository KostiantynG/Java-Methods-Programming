package by.bsu.proj.run;

import by.bsu.proj.accountlogic.AccountOperationManager;
import by.bsu.proj.accountlogic.AccountOperationManagerImpl;
import by.bsu.proj.annotation.logic.SecurityFactory;

public class AnnoRunner {
    public static void main(String[] args) {
        AccountOperationManager account = new AccountOperationManagerImpl();
        //"регистрация класса" для включения аннотаций в обработку.
        AccountOperationManager securityAccount =
                SecurityFactory.createSecurityObject(account);
        securityAccount.depositInCash(10128336, 6);
        securityAccount.withdraw(64092376, 2);
        securityAccount.convert(200);
        securityAccount.transfer(64092376, 300);
    }
}