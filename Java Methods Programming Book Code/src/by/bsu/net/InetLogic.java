package by.bsu.net;

/* # 1 # вывод IP-адреса компьютера и Интернет-ресурса # InetLogic.java*/

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetLogic {
    public static void main(String[] args) {
        InetAddress currentIP = null;
        InetAddress ipByInternetAddress = null;
        try {
            currentIP = InetAddress.getLocalHost();
            // вывод IP-адреса локального компьютера
            System.out.println("Мой IP -> " + currentIP.getHostAddress());
            ipByInternetAddress = InetAddress.getByName("www.miran.kiev.ua");
            // вывод IP-адреса
            System.out.println("www.miran.kiev.ua -> " + ipByInternetAddress.getHostAddress());
        } catch (UnknownHostException e) {
            // если не удается найти IP
            System.err.println("Адрес недоступен " + e);
        }
    }
}