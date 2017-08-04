package by.bsu.resource.exception;

/**
 * # 20 # исключение, информирующее о сбое в поставке ресурса # ResourceException.java
 * <p>
 * Класс ResourceException желателен в такого рода задачах, чтобы точно описать
 * возникающую проблему при работе ресурса, используемого конкурирующими потоками.
 */

public class ResourсeException extends Exception {
    public ResourсeException() {
        super();
    }

    public ResourсeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourсeException(String message) {
        super(message);
    }

    public ResourсeException(Throwable cause) {
        super(cause);
    }

}
