package com.company;
import java.util.*;


public class Money_5 {
    public static void main(String[] args) {
        System.out.println("Введите цену товара");
        Scanner scInp = new Scanner(System.in);
        int y = scInp.nextInt();//price-цена
        System.out.println("Введите сколько у вас денег в кошельке");
        int x = scInp.nextInt();// money in the wallet-деньги в кошельке
        int a = x / y;// Quantity goods-число товаров
        System.out.println("Количество товаров: " + a);
        int b= x%y;
        System.out.println("Сдача: "+b);

    }
}
