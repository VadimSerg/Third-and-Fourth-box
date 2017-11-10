/*//////////////////////////////////////////////////////////////////////////////////////////////
************************************Корень линейного уравнения                                 /
 */////////////////////////////////////////////////////////////////////////////////////////////
package com.company;
// ax+b=0
import java.util.Scanner;
import java.util.Locale;

            public class Equation {
                public static void main(String[] args) {
                    System.out.println("Введите a,нажмите ENTER (Input the a,push Enter):");
                    Scanner scInp = new Scanner(System.in).useLocale(Locale.US);
                    System.out.println();
                    System.out.println("Введите b,нажмите ENTER (Input the b,push Enter):");
                    System.out.println();
                    float a = scInp.nextFloat();// объявили переменную a, куда с помощью метода сканера, вводим число с консоли,присваивая
                    // его к переменной a
                    float b = scInp.nextFloat();// смотреть комментарий выше,тоже самое но для второго числа
                    float x = -b / a;
        System.out.println("Корень линейного уравнения:" + x); //Вывод значения среднеарифметического трех чисел

    }
}


