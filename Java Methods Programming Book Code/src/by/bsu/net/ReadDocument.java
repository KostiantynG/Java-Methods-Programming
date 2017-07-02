package by.bsu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * # 4 # чтение документа из Интернета # ReadDocument.java
 */

public class ReadDocument {
    public static void main(String[] args) {
        URL url = null;
        String urlName = "http://www.miran.kiev.ua";
        try {
            url = new URL(urlName);
        } catch (MalformedURLException e) {
            // некорректно заданы протокол, доменное имя или путь к файлу
            e.printStackTrace();
        }
        if (url == null) {
            throw new RuntimeException();
        }
        try (BufferedReader d = new BufferedReader(new InputStreamReader(
                url.openStream()))) {
            String line;
            while ((line = d.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}