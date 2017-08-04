package by.bsu.lock;

import java.util.concurrent.TimeUnit;

/**
 * # 37 # запуск процессов доступа к ресурсу # SynchroMain.java
 * <p>
 * Пусть необходим нереляционный способ сохранения информации в коллекции,
 * когда неделимым квантом информации считается пара или более следующих
 * друг за другом элементов. То есть добавление и удаление элементов может
 * осуществляться только парами и другой поток не может добавить/удалить свои
 * элементы, пока заблокировавший коллекцию поток полностью не выполнит свои действия.
 */
public class SynchroMain {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            DoubleResource resource = new DoubleResource();
            new ResThread("a", resource).start();
            new ResThread("Z", resource).start();
            new ResThread("#", resource).start();
            TimeUnit.MILLISECONDS.sleep(1_000);
            System.out.println(resource);
        }
    }
}