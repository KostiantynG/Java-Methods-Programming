package by.bsu.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * # 2 # присваивание фиктивного имени реальному ресурсу, заданному через IP #UnCheckedHost.java
 */
public class UnCheckedHost {
    public static void main(String[] args) {
        // задание IP-адреса в виде массива
        byte ip[] ={(byte)178, (byte)20, (byte)153, (byte)65}; //178.20.153.65
        try {
            InetAddress addr = InetAddress.getByAddress("localhost", ip);
            System.out.println("addr:" + addr);
            System.out.println(addr.getHostName()+ "-> cоединение:" + addr.isReachable(1000));
        } catch (UnknownHostException e) {
            System.err.println("адрес недоступен " + e);
        } catch (IOException e) {
            System.err.println("ошибка потока " + e);
        }
    }
}