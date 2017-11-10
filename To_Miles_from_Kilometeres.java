/*
Программа для перевода километров в морские и сухопутные мили
 */
package com.company;
import java.util.Scanner;//Импортируем библиотеки ввода
import java.util.Locale;// и локализации
public class To_Miles_from_Kilometeres {// класс назван так для удобства
             public static void main(String[] args) {
                 Scanner inP=new Scanner (System.in).useLocale(Locale.US);
            System.out.println("Введите километры: ");
                 double km = inP.nextDouble();
                 final double  kS = 1.852;// в 1 морской миле 1,852 км
                 final double kM=1.60934; // в 1 сухопутной миле 1,60934 км
                 double sea_miles=(1/kS)*km;
                 double mil=(1/kM)*km;
                    System.out.println("Морские мили: "+sea_miles);
                    System.out.println("Сухопутные мили: "+mil);
    }
}
