package by.bsu.synchro;

/**
 * # 15 # взаимодействие wait() и notify() # Payment.java # PaymentRunner.java
 */

public class PaymentRunner {
    public static void main(String[] args) throws InterruptedException {
        final Payment payment = new Payment();
        // вызов synchronized метода из синхронизированного блока кода
        new Thread(payment::doPayment).start();
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(200);
        synchronized (payment) { // 1-ый блок
            while (payment.getAmount() <= 0) {
                System.out.println("WAIT_First_Block");
                System.out.println("Init amount:");
                payment.initAmount();
            }
            payment.notify(); // уведомление о возврате блокировки
        }
        synchronized (payment) { // 2-ой блок
            payment.wait(1_000);
            System.out.println("end");
        }
    }
}