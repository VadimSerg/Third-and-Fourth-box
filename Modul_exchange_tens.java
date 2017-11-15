/*////////////////////////////////////////////////////////////////////////
    При вводе с клавиатуры двух трехзначных чисел поменять средние цифры//
 *////////////////////////////////////////////////////////////////////////


package com.company;
import java.util.*;

public class Modul_exchange_tens {
        public static void main(String[] args) {
                Scanner inP= new Scanner(System.in);

            int x=inP.nextInt();

      //     if ((x>1000)(x<100)) {
             // System.out.println("Повторите ввод");
     //   }
            int d=inP.nextInt();
           // int x=357;
          //  int d=702;
            int p=x%100/10;//определяем число десятков в первом числе
            int q=d%100/10;//определяем число десятков во втором числе
            int c=p;//Производим обмен
            p=q;    //десятками
            q=c;    //между двумя числами испльзуя третью переменную
            int a=x/100*100+x%10+p*10;//Собираем число из разбитых, ранее введеных чисел
            int b=d/100*100+d%10+q*10;//См. коммент выше

                System.out.println("p = " +   p);
                System.out.println("q = " +   q);
                System.out.println("a = " +   a);
                System.out.println("b = " +   b);





	// write your code here
    }
}
