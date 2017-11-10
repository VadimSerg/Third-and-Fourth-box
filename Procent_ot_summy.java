package com.company;
import java.util.Scanner;// import Scanner(импорт сканнера)
import java.util.Locale;
public class Procent_ot_summy {
        public static void main(String[] args) {
            Scanner scInp = new Scanner(System.in).useLocale(Locale.UK);
            System.out.println("Введите сумму: ");
            double S=scInp.nextDouble();// Ввод  общей суммы
            double Proc_v_ie=scInp.nextDouble();
            double P=Proc_v_ie /S*100;
            System.out.println("Процент Р от суммы S= "+P+" %");
    }
}
