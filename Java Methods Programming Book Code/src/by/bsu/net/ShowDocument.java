package by.bsu.net;

import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JApplet;

/**
 * # 3 # запуск страницы из апплета # ShowDocument.java
 * Метод showDocument() может содержать параметры для отображения стра-
 * ницы различными способами: «_self» — выводит документ в текущий фрейм,
 * «_blank» — в новое окно, «_top» — на все окно, «_parent» — в родительском
 * окне, «имя_окна» — в окне с указанным именем.
 * Для корректной работы дан-ного примера апплет следует запускать из браузера, используя следующий
 * HTML-документ:
 * <html>
 * <body align=center>
 * <applet code= by.bsu.net.ShowDocument.class></applet>
 * </body></html>
 */

public class ShowDocument extends JApplet {
    private URL bsu = null;
    public String getBaseURL() {
        return "http://www.miran.kiev.ua";
    }
    public void paint(Graphics g) {
        int timer = 0;
        g.drawString("Загрузка страницы", 10, 10);
        try {
            for (; timer < 30; timer++) {
                g.drawString(".", 10 + timer * 5, 25);
                Thread.sleep(100);
            }
            bsu = new URL(getBaseURL());
            this.getAppletContext().showDocument(bsu, "_blank");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
        // некорректно задан протокол, доменное имя или путь к файлу
            e.printStackTrace();
        }
    }
}