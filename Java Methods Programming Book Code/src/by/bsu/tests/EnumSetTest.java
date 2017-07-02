package by.bsu.tests;

import java.util.EnumSet;

/**
 * <p>Что будет выведено при попытке компиляции и запуска программы?
 * 1) [UNO, DOS, TRES, CINCO, SEIS, SIETE]
 * 2) [DOS, TRES, CUATRO, CINCO, SEIS]
 * 3) [UNO, DOS, SEIS, SIETE]
 * 4) ошибка компиляции в строке 1
 * 5) ошибка компиляции в строке 2
 * 6) ничего из перечисленного
 */
enum PCounter {
    UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE
}

public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet<PCounter> enst1 = EnumSet.range(PCounter.TRES, PCounter.CINCO);//1
        EnumSet<PCounter> enst2 = EnumSet.complementOf(enst1);//2
        System.out.println(enst2);
    }
}