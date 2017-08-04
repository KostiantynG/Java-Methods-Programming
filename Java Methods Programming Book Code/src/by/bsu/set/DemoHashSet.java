package by.bsu.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * # 14 # использование множества для вывода всех уникальных слов из файла #
 * DemoHashSet.java
 */
public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(100);
        long callTime = System.nanoTime();
        Scanner scan = null;

        scan = new Scanner(" a texts afa test texts afa");
        scan.useDelimiter("[^A-z]+");
        while (scan.hasNext()) {
            String word = scan.next();
            words.add(word.toLowerCase());
        }


        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        TreeSet<String> ts = new TreeSet<>(words);
        System.out.println(ts);
        long totalTime = System.nanoTime() - callTime;
        System.out.println("различных слов: " + words.size() + ", "
                + totalTime + " наносекунд");
    }
}