package by.bsu.dumb;

/**
 * # 2 # вызов полиморфного метода из конструктора # Dumb.java # Dumber.java
 */
class Dumb extends Object {
    int id;

    {
        this.id = 6;
    }

    Dumb() {
        System.out.println("конструктор класса Dumb ");
        // вызов потенциально полиморфного метода - плохо
        id = this.getId();
        System.out.println(" id=" + id);
    }

    int getId() { // 1
        System.out.println("getId() класса Dumb ");
        return id;
    }
}

class Dumber extends Dumb {
    int id = 9; // получится два поля с одинаковыми именами

    Dumber() {
        System.out.println("конструктор класса Dumber ");
        id = this.getId();
        System.out.println(" id=" + id);
    }

    @Override
    int getId() { // 2
        System.out.println("getId() класса Dumber ");
        return id;

    }
}