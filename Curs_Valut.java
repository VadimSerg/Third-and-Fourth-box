/*///////////////////////////////
            Конвертация валют///
*///////////////////////////////
package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Curs_Valut {
    public static void main(String[] args) {
        final double C_dolar= 0.01695100000025935;//инилизация константы
        final double C_euro= 0.014688601645123384;
                System.out.println("Введите количество рублей: ");
        Scanner inP=new Scanner (System.in).useLocale(Locale.US);
        double Rub=inP.nextDouble();
        double Dolar=C_dolar*Rub;
        double euro=C_euro*Rub;
        System.out.println("Доллары: "+Dolar);
        System.out.println("Евро"+euro);
    }
}
