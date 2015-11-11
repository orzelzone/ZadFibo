package com.slawekkami;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowtą do 92");
        int liczbaN = klawiatura.nextInt();
        klawiatura.close();
        System.out.println("Obliczenie " + liczbaN + " Liczby ciągu Fibonacciego metodą iteracyjną:");
        System.out.println(fiboiter(liczbaN));
        if (liczbaN <= 40){
        System.out.println("Obliczenie " + liczbaN + " Liczby ciągu Fibonacciego metodą rekurencyjną:");
        System.out.println(fiboreku(liczbaN));}
        else
            System.out.println("Metoda rekurencyjna została pominieta ze względu na czas wykonania.");

    }
    //Metoda oblicza iteracyjnie
   public static long fiboiter(long n){
       if(n==0) return 0;
       long a, b, c ;
       a = 1;
       b = 1;
       if(n<=2) return a;
       for(int i=0; i < n-2; i++) {
           c = a + b;
           a = b;
           b = c;
       }
       return b;
    }
    //metoda oblicza rekurencyjnie
    public static long fiboreku(long n){
        if(n==1 || n==0){
            return n;
        }
        else
           return fiboreku(n - 1) + fiboreku(n - 2);
    }
}
