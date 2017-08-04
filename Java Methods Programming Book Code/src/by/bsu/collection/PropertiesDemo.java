package by.bsu.collection;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * # 21 # загрузка файла properties в экземпляр и доступ к содержимому
 * #PropertiesDemo.java
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties props = new Properties();
        try {
            // загрузка пар ключ-значение через поток ввода-вывода
            props.load(new FileReader("D:" + File.separator + "JavaProjects" + File.separator + "Java-Methods-Programming" + File.separator + "Java Methods Programming Book Code" + File.separator + "prop" + File.separator + "database.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String driver = props.getProperty("db.driver");
        // следующих двух ключей в файле нет
        String maxIdle = props.getProperty("db.maxIdle"); // будет присвоен null
        // значение "20" будет присвоено ключу, если он не будет найден в файле
        String maxActive = props.getProperty("db.maxActive", "20");
        System.out.println(driver);
        System.out.println(maxIdle);
        System.out.println(maxActive);
    }
}