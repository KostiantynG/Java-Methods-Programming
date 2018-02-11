package by.bsu.resource;

import java.util.Locale;

/**
 * # 12 # извлечение информации из файла ресурсов и смена локали
 * # ResourceManagerRun.java
 */
public class ResourceManagerRun {
    public static void main(String[] args) {
        ResourceManager manager = ResourceManager.INSTANCE;
        System.out.println(manager.getString("str1"));
        manager.changeResource(new Locale("be", "BY"));
        System.out.println(manager.getString("str1"));
    }
}