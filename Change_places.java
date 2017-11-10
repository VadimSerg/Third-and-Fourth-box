package com.company;

public class Change_places {

    public static void main(String[] args) {
	            int a=50,b=30;
	            int c=a-b;
		System.out.println("c= "+c);
				a=a-c;
	            System.out.println("a= "+a);
	            b=c+b;
	            System.out.println("b= "+b);
        System.out.println("Без третьей переменной");

        a = 50;
        b = 30;
            a = a - b;
            b = a + b;
            a = b - a;
            System.out.println("a= " + a);
            System.out.println("b= " + b);


        }
	          }

