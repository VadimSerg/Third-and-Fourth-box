package com.company;

import java.util.Locale;
import java.util.Scanner;
//import java.util.Locale;

public class Third_Box {

    public static void main(String[] args) {
        System.out.println("Выберите задачу,нажав на соответсвующую цифру");
        System.out.println();
        Scanner chsel=new Scanner(System.in);
        int choice=chsel.nextInt();
        switch (choice){
            case 1: act1();
            break;
            case 2: act2();
            break;
            case 3: act3();
            break;
            case 4: act4();
            break;
            case 5: act5();
            break;
            case 6: act6();
            default:
                System.out.println("В разработке");
        }
           // act1();
          //  act2();
          //  act3();
          //  act4();
         //   act5();
          //  act6();
          //  act7();
          //  act8();
          //  act9();
          //  act10();



    }

     private static void act1() {
         Scanner scInp=new Scanner(System.in).useLocale(Locale.UK);
         System.out.println("Введите скорость в метрах в секунду");
          double v = scInp.nextDouble();
         System.out.println("Введите расстояние в километрах");
        double s = scInp.nextDouble();
        double t = s * 1000 / v;//время в секундах
        int hours = (int) (t / 3600);//время в часах
        int minutes = (int) (t / 60 - hours * 60);// время в минутах
        int ti = (int) (t - hours * 60 * 60 - 60 * minutes);// время в секундах

      System.out.println(t + " с");//индикация времени в секундах полностью
      System.out.println(hours + " ч");//индикация времени в часах
      System.out.println(minutes + " мин");//индикация времени в минутах
       System.out.println(ti + " с");//индикация времени в секундах
  }

    private static void act2(){

        Scanner scInp=new Scanner(System.in).useLocale(Locale.UK);
        double x=scInp.nextDouble();
        int t = (int) x;
        double fp=x-t;


        double y=scInp.nextDouble();
        int u=(int) y;
        double fd=y-u;

        int m=t+u;
        double p= fd+fp;
        double su=x + y;

        if (p >=1) {
            m++;
        }

        System.out.println("Сумма целых частей: " +m);
        System.out.println("Сумма дробных частей: " +p);
        System.out.println("Сумма введеных чисел: "+(x+y));
    }

       private static void act3(){
           System.out.println("В разработке");
       }

       private static void act4(){

    Scanner scInp=new Scanner(System.in).useLocale(Locale.UK);
    double x=scInp.nextDouble();
    int t = (int) x;

                 System.out.println(t+ " тонн");//вывод в тоны

    int k=(int)(x*1000%1000);
                  System.out.println(k+" кг");

    int g=(int)(x*1000000%1000);
                  System.out.println(g+ 	" грамм");
}
    private static void act5(){}

    private static void act6() {
        Scanner scInp= new Scanner(System.in);
        System.out.println("Введите расстояние в км: ");
        double s=scInp.nextDouble();
        System.out.println("Введите время в минутах: ");

        double t= scInp.nextDouble();
        //	int t=scInp.nextInt();
        //double th=(double)(t/60);
        double th =t/60;
        double v=s/th;
        System.out.println("Скорость до аэропта в км/ч : "+ v + " при времени " +th+ 	" час.");





    }


}
