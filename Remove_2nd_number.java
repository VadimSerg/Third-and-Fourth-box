/*//////////////////////////////////////////////
Ввод 3-значного числа и удаление средней части//
 *//////////////////////////////////////////////
package com.company;
import  java.util.Scanner;
public class Remove_2nd_number {

                public static void main(String[] args) {

                        Scanner scInP=new Scanner(System.in);

                        int x=scInP.nextInt();

                        x = x / 100 * 10+x % 10;

                    System.out.println("Выведено число : "+x);

	    }
}
