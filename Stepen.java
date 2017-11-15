/*
created by VadimSerg. Данная программа, предназначена для возведения в степень
*/

package com.company;
import java.util.*;
public class Stepen {

    public static void main(String[] args)
    {
        System.out.println("Введите основание b!");

        Scanner input = new Scanner(System.in);

        double b = input.nextDouble();

        System.out.println("Введите показатель степени а: ");
        System.out.println();


        int a = input.nextInt();
        int i;

        if (a==0){// проверка показателя степени,если он равен,то любое число в степени будет равно единице
            int	 s=1;
            System.out.println(b+" в степени "+ a+" равно "+ s);
        }
        else  if (a>0) {// иначе ,если показатель степени положительный,то основание нужно перемножить на себя а-раз
            double t=1;
            for(i=1;i<=a;i++){
                t=t*b;

                //System.out.println( b+"в степени"+(i)+ "равно" +t);
            }
            System.out.println( b+" в степени  "+(a)+ " равно " +t);
        }
        else  {												// а если отрицательное,то разделить 1 на основание а раз
            double f=1;
            for(i=-1;i>=a;i--){
                // t=1;
                f=f/b;
            }

            System.out.println( b+" в степени  "+(a)+ " равно " +f);

        }
    }
}

