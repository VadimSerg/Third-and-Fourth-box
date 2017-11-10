/*
Перевод из Цельсия в Фаренгейт,Кельвина,Реомюра, Делиля,а также из Фаренгейта в Цельсия;добавлено меню выбора шкал
 */

package com.company;
import java.util.*;

            public class Degree {

                         public static void main(String[] args) {

                System.out.println("Выберете меню:");
                System.out.println("Для расчета количества  градусов по шкале Фаренгейта и т.д Нажмите -1- ");
                System.out.println("Для расчета количества  градусов по шкале Цельсия нажмите -2- " );
                                Scanner scanner=new Scanner(System.in);
                                Scanner scInP=new Scanner (System.in).useLocale(Locale.US);
                                int menu=scanner.nextInt();
                                switch (menu){
                                            case 1:
             System.out.println("Введите кол-во градусов по шкале Цельсия: ");

                            double tC=scInP.nextDouble();
                            double tF=tC*9/5+32;
                            System.out.println("Температура по шкале Фаренгейта: "+tF);
                            System.out.println();
                                    double tK= tC+273.15;
                                System.out.println("Температура по шкале Кельвина: "+tK);
                                System.out.println();
                                            double tR= tC*4/5;
                                        System.out.println("Температура по шкале Реомюра: "+tR);
                                        System.out.println();
                                                    double tD=(100-tC)*3/2;
                                         System.out.println("Температура по шкале Делиля: "+tD);
                                         System.out.println();
                                            break;
                                            case 2:
                                                System.out.println("Введите значение в Фаренгейтах: ");
                                                    double tFc;
                                                tFc = scInP.nextDouble();
                                                double tFC=(tFc-32)*5/9;
                                                 System.out.println("Температура по шкале Цельсичя: "+tFC);
                                            break;
                                            default:
                                                System.out.println("Извините, остальные вариаты находятся в разработке :)");
                                }
    }
}
