package by.bsu.enummap;


import java.util.EnumMap;

/**
 * # 18 # пример работы с классом EnumMap # GASStation.java # Gases.java
 */
public class Gases {
    public static void main(String[] args) {
        EnumMap<GASStation, Integer> station1 =
                new EnumMap<>(GASStation.class);
        station1.put(GASStation.DT, 60);
        station1.put(GASStation.A80, 5);
        station1.put(GASStation.A92, 30);
        station1.put(GASStation.DT, 50);
        EnumMap<GASStation, Integer> station2 =
                new EnumMap<>(GASStation.class);
        station2.put(GASStation.DT, 25);
        station2.put(GASStation.A95, 25);
        System.out.println(station1);
        System.out.println(station2);
    }
}