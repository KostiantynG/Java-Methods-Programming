package by.bsu.entity;

import java.util.Vector;

/**
 * # 14 # безопасная передача по ссылке # CloneRunner.java
 */
public class CloneRunner {
    private static void mutation(StudentBaseTypeCloneable p) {
        try {
            p = (StudentBaseTypeCloneable) p.clone(); // клонирование
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        p.setId(1000);
        System.out.println("->id = " + p.getId());
    }

    private static void mutation(StudentObjectTypeCloneable p) {
        p = p.clone(); // клонирование
        p.setId(1000);
        Vector<Byte> v = new Vector<>();
        v.add(0,new Byte("3"));
        p.setV(v);
        System.out.println("->id = " + p.getId());
    }

    public static void main(String[] args) {
        StudentBaseTypeCloneable ob = new StudentBaseTypeCloneable();
        ob.setId(71);
        System.out.println("id = " + ob.getId());
        mutation(ob);
        System.out.println("id = " + ob.getId());

        StudentObjectTypeCloneable ob2 = new StudentObjectTypeCloneable();
        ob2.setId(7);
        Vector<Byte> v = new Vector<>();
        v.add(0,new Byte("2"));
        ob2.setV(v);
        System.out.println("id = " + ob2.getId()+ ", v = " + ob2.getV());
        mutation(ob2);
        System.out.println("id = " + ob2.getId()+ ", v = " + ob2.getV());
    }
}
