/*///////////////////////////////////////////////////////////////////////////////
                    Нахождение длины и площади окружности при вводе радиуса//////
*////////////////////////////////////////////////////////////////////////////////
package com.company;
import java.util.Scanner;//импорт сканера для ввода данных
import java.util.Locale;//локализация по английсикй
public class S_L_okrujnost {
            public static void main(String[] args) {
            final double Pi=3.1415926536;//инилизация константы
            System.out.println("Введите радиус");
                       Scanner inP=new Scanner (System.in).useLocale(Locale.US);
            double r=inP.nextDouble();
            double Length=2*Pi*r;
            double Square=Pi*r*r;
                System.out.println("Площадь окружности"+Square);
                System.out.println("Длина окружности"+Length);
    }
}
