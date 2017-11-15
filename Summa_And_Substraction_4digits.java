/*///////////////////////////////////////////////////////////////////////////////////////////
Ввод 4-значного и подсчет суммы первой и третьей цифры и разность второй и четвертой цифры//
 *//////////////////////////////////////////////////////////////////////////////////////////

package com.company;
import java.util.*;
public class Summa_And_Substraction_4digits {
    public static void main(String[] args) {
        System.out.println("Введите 4-х значное число");
        Scanner inP=new Scanner(System.in);
        int s=inP.nextInt();
        //int s=4589;//Число вводимое с клавы
        int q=s/1000;//Первая цифра
        int p=s%1000/100;//Вторая цифра
        int t=s%100/10;//Третья цифра
        int m=s%10;//Четвертая цифра
        int summa=q+t;
        int dif=p-m;


        System.out.println("Первая цифра:"+  q);
        System.out.println("Вторая цифра:"+  p);
        System.out.println("Третья цифра: "+t);
        System.out.println("Четвертая цифра: "+m);
        System.out.println("Сумма первой и третьей цифры: "+summa );
        System.out.println("Разность второй и четвертой цифры: "+dif);
        // write your code here
    }
}
