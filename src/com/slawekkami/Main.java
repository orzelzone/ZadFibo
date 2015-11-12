package com.slawekkami;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowtą");
        int liczbaN = klawiatura.nextInt();
        klawiatura.close();
        System.out.println("Obliczenie " + liczbaN + " Liczby ciągu Fibonacciego metodą iteracyjną:");
        if (liczbaN<93){
            System.out.println(fiboiter(liczbaN));
        }else{
            //fiboiterBig(liczbaN);
            System.out.println(fiboiterBig(liczbaN).toString());
        }

        if (liczbaN <=38) {
            System.out.println("Obliczenie " + liczbaN + " liczby ciągu Fibonacciego metodą rekurencyjną:");
            System.out.println(fiboreku(liczbaN));
            //System.out.println(fiborekuBig(liczbaN).toString());
        } else
            System.out.println("Metoda rekurencyjna została pominieta ze względu na czas wykonania.");



    }

    //Metoda oblicza iteracyjnie
    public static long fiboiter(long n) {
        if (n == 0) return 0;
        long a, b, c;
        a = 1;
        b = 1;
        if (n <= 2) return a;
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    //metoda oblicza rekurencyjnie
    public static long fiboreku(long n) {
        if (n == 1 || n == 0) {
            return n;
        } else
            return fiboreku(n - 1) + fiboreku(n - 2);
    }

    //metoda oblicza rekurencyjnie
    /*public static BigInteger fiborekuBig(long n) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("0");
     switch ((int)n) {
        case 0:
        return b;
        //break;
        case 1:
        return a;
        //break;
        default:
        return fiborekuBig(n - 1).add(fiborekuBig(n - 2));
     }

    }*/




     // metoda iteracyjna na BigIntegerach
    public static BigInteger fiboiterBig(long n) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("0");

        if (n == 0) {
            //System.out.println("0");
            return c;
        } else if (n <= 2) {
            //System.out.println("");
            return a;
        }else {
            for (int i = 0; i < n - 2; i++) {
                c = a.add(b);
                a = b;
                b = c;
            }
            //System.out.println(b.toString());
            return b;
        }
    }


}
