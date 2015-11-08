package com.slawekkami;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(fiboiter(18));
        System.out.println(fiboreku(18));
    }
    //Metoda oblicza iteracyjnie
   public static int fiboiter(int n){
       if(n==0) return 0;
       int a, b, c ;
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
    public static int fiboreku(int n){
        if(n==1 || n==0){
            return n;
        }
        else
           return fiboreku(n - 1) + fiboreku(n - 2);
    }

}
