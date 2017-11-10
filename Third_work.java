

/*                      Вывод четного числа/*

 */
package com.company;
import java.util.Scanner;// import Scanner(импорт сканнера)
public class Third_work {
    public static void main(String[] args) {
        Scanner scInp = new Scanner(System.in);//shown the variable scInp refers to class Scanner Указали что
// переменная scInp относится к классу Сканер
        int n = scInp.nextInt();// объявили переменную n, куда с помощью метода сканера, вводим число с консоли,присваивая
        // его к переменной n
        n++;
        n*= 2;
        System.out.println("Четное число:" + n);
    }
}


