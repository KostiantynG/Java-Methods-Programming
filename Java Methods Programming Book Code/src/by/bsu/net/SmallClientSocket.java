package by.bsu.net;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * # 7 # получение клиентом строки # SmallClientSocket.java
 * Перед запуском SmallClientSocket запустить SmallServerSocket
 */
public class SmallClientSocket {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader br = null;
        try { // получение строки клиентом
            socket = new Socket("localhost", 8030);
            /* здесь "ИМЯ_СЕРВЕРА" компьютер, на котором стоит сервер-сокет"*/
            br = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            String message = br.readLine();
            System.out.println(message);
        } catch (IOException e) {
            System.err.println("ошибка: " + e);
        } finally {
            if (br != null) {
                try { // разрыв соединения
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (socket != null) {
                    try { // разрыв соединения
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}