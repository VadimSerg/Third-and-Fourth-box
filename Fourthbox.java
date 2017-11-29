package com.company;
import java.util.Locale;
import java.util.Scanner;
//import java.util.Locale;

public class Fourthbox {


    public static void main(String[] args) {
        System.out.println("Выберите задачу,нажав на соответсвующую цифру");
        System.out.println();
        Scanner chsel = new Scanner(System.in);
        int choice = chsel.nextInt();
        switch (choice) {
            case 1:
                act1();
                break;
            case 2:
                act2();
                break;
            case 3:
                act3();
                break;
            case 4:
                act4();
                break;
            case 5:
                act5();
                break;
            case 6:
                act6();
                break;
            case 7:
                act7()  ;
                break;
            case 8:
                act8();
                break;
            default:
                System.out.println("В разработке");
        }
        act1();
        act2();
        act3();
        act4();
        act5();
        act6();
        act7();
        act8();
        //  act9();
        //  act10();
        //  act11();
        //  act12();
        //  act13()


    }

    private static void act1() {


        Scanner scInp = new Scanner(System.in);
        System.out.println("Введите ваше число");
        int x = scInp.nextInt();
        if (x % 2 == 0)
            System.out.println("Число четное");
        else
            System.out.println("Нечетное");
    }


    private static void act2() {

        Scanner scInp = new Scanner(System.in);
        System.out.println("Введите первое число а");
        int a = scInp.nextInt();
        System.out.println("Введите второе число b");
        int b = scInp.nextInt();
        System.out.println("Введите третье число c");
        int c = scInp.nextInt();
        if ((a < b) && (a < c)) {
            System.out.println("а меньшее число из всех");
        } else if ((a > c) && (b > c)) {
            System.out.println("c меньшее число из всех");

        } else if ((a > b) && (c > b)) {
            System.out.println("b наименьшее число");
        } else if ((a == b) && (c > b)) {
            System.out.println("a и b - меньшие числа");
        } else if ((a == c) && (b > c)) {
            System.out.println("a и с -меньшие числа");
        } else if ((b == c) && (b < a)) {
            System.out.println("b и  c меньше а");
        }
    }

    private static void act3() {
        System.out.println("Введите число");
        Scanner scInp = new Scanner(System.in);
        int x = scInp.nextInt();
        if (x == 0) {
            System.out.println("Число равно нулю");
        } else if (x > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println(" Число отрицательное");
        }


    }

    private static void act4() {

        Scanner scInp = new Scanner(System.in);

        System.out.println("Введите 2 числа");
        double a = scInp.nextDouble();
        double b = scInp.nextDouble();

        System.out.println("Выберите меню,нажав на соответствующую цифру");
        System.out.println("1." + ")" + " a+b");
        System.out.println("2." + ")" + " a-b");
        System.out.println("3." + ")" + " a*b");
        System.out.println("4." + ")" + " a/b");
        System.out.println("5." + ")" + " a%b");

        int menu = scInp.nextInt();
        switch (menu) {
            case 1:
                System.out.println("a+b= " + (a + b));
                break;

            case 2:
                System.out.println("a-b= " + (a - b));
                break;


            case 3:
                System.out.println("a*b= " + (a * b));
                break;

            case 4:

                if (b == 0)
                    System.out.println("Введите значение второго числа b ,отличное от нуля");
                else

                    System.out.println("a/b= " + (a / b));
                // double c=scInp.nextDouble();
                //     System.out.println(" a/b= "+ (a/c));

                break;

            case 5:

                if (b != 0)
                    System.out.println("a%b= " + (a % b));
                else
                    System.out.println("Введите значение второго числа b,отличное от нуля");
                double d = scInp.nextDouble();
                break;
            default:
                System.out.println("Введите число от 1 до 5");
        }
    }


    private static void act5() {
        System.out.println("Доработкв");
    }


    private static void act6() {

        double n = -567.88777;
        double m = 567.7770600799333;


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        double var = sc.nextDouble();
        if ((var >= n) && (var <= m)) {
            System.out.println("Данное число принадлежит диапозону от  " + n + " до " + m);
        } else {
            System.out.println("Данное число не принадлежит диапоoзону от " + n + " до " + m);

        }
    }

            private static void act7(){
                System.out.println("Не работает");
                  }

    private static void  act8(){

        System.out.println("Input your damn  number");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        if ((x%3==0)&&(x%5==0)&&(x%7==0))
            System.out.println(x +" кратно 3,5,7 одновременно" );
        else
            System.out.println(x +" не кратно 3,5,7");

    }






}





