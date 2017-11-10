/*
Среднее арифметическое трех чисел
 */
package com.company;
import java.util.Scanner;// import Scanner(импорт сканнера)
import java.util.Locale;
public class Fourth {
       public static void main(String[] args) {
        Scanner scInp = new Scanner(System.in).useLocale(Locale.US);//shown the variable scInp refers to class Scanner Указали что
// переменная scInp относится к классу Сканер
            System.out.println("Введите первое число,нажмите ENTER (Input the first number,push Enter):");
        //Scanner scInp_b = new Scanner(System.in);//тоже самое что и в строке 9
            System.out.println("Введите второе число,нажмите ENTER (Input the second number,push Enter):");
        //Scanner scInp_c = new Scanner(System.in);//тоже самое что и в строке 9,12
            System.out.println("Введите третье число,нажмите ENTER (Input the third number,push Enter):");
        float a = scInp.nextFloat();// объявили переменную a, куда с помощью метода сканера, вводим число с консоли,присваивая
        // его к переменной a
        float b = scInp.nextFloat();// смотреть комментарий выше,тоже самое но для второго числа
        float c = scInp.nextFloat();//тоже самое
        float d = (a + b + c) / 3;
                                System.out.println("Среднее арифметическое трех чисел:" + d); //Вывод значения среднеарифметического трех чисел

    }
}



