/*///////////////////////////////////////////////////
            Диаметр окружности по длине проволоки///
 */////////////////////////////////////////////////
package com.company;
import java.util.*;
                        public class Diametr {

                    public static void main(String[] args) {
            Scanner skInp=new Scanner (System.in).useLocale(Locale.US);
      System.out.println("Введите длину проволоки :");
            double x=skInp.nextDouble();
            final double  Pi=3.14159265;
            double d=x/Pi;
      System.out.println ("Диаметр окружности: "+d) ;

    }
}
