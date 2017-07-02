package by.bsu.collect;

/* # 23 # применение некоторых алгоритмов # AlgorithmDemo.java */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlgoritmDemo {
    public static void main(String[] args) {
//        Comparator<Integer> comp = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer n, Integer m) {
//                return m - n;
//            }
//        };

        Comparator<Integer> comp = (Integer o1, Integer o2) -> o2 - o1;

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        System.out.println ("list");
        print(list);

        Collections.shuffle(list);
        System.out.println("Collections.shuffle(list)");
        print(list);

        list.sort(comp); //Collections.sort(list, comp);
        System.out.println("list.sort(comp)");
        print(list);

        Collections.reverse(list);
        System.out.println("Collections.reverse(list)");
        print(list);

        Collections.rotate(list, 3);
        System.out.println("Collections.rotate(list, 3)");
        print(list);

        System.out.println("Collections.min(list, comp): " + Collections.min(list, comp));
        System.out.println("Collections.max(list, comp): " + Collections.max(list, comp));

        List<Integer> singl = Collections.singletonList(71);
        System.out.println("List<Integer> singl = Collections.singletonList(71)");
        print(singl);
        // singl.add(21); // ошибка времени выполнения
    }

    private static void print(List<Integer> c) {
        for (int i : c) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}