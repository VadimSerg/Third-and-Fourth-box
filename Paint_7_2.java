/*
Программа для определения количества краски и стоимости при введении длины,ширины,высоты,помещения ,
процетра площади окон и дверей и т.д
 */


package com.company;
import java.util.*;
public class Paint_7_2 {

    public static void main(String[] args) {

            Scanner scInp=new Scanner(System.in);
            System.out.println ("Введите длину-Input length: ");
            System.out.println ();

        double l=scInp.nextDouble();

            System.out.println ("Введите ширину-Input width: ");
            System.out.println ();

        double b= scInp.nextDouble();

            System.out.println ("Введите высоту-Input height");
            System.out.println ();

        double h=scInp.nextDouble();

            System.out.println("Введите расход краски -литров на кв.метр");
            System.out.println();

        double n_paint=scInp.nextDouble();//колво краски на кв.м;

            System.out.println("Процент площади поверхности");
        double m=scInp.nextDouble();// процент площади занимаемых окон
            System.out.println();
            System.out.println("Введите цену 1 лита краски ");
            System.out.println();

        double r=scInp.nextDouble();// цена 1 литра краски

        double SquFull= 2* l* h+ 2 *b* h;// Площадь без учета окон и дверей
        System.out.println("Площадь помещения " +SquFull);
        System.out.println();

        double s= SquFull-SquFull/100*m;// Площадь за вычетом дверей

        System.out.println("Площадь помещения с учетом окон и дверей: "+s);

        double  vPa= s*n_paint;// Колво краски на всю комнату

        System.out.println("Объем краски в литрах: " +vPa);
        double Fcost=r*s;
        System.out.println("Полная стоимость: " +Fcost);


    }
}
