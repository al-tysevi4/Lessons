package com.company.Exceptions;

import java.util.Arrays;

public class MyMain {

    public static void main(String[] args) {
        int a;
        int b;
        int[] x = new int[] {6,7,8,9};
        int[] y = new int[] {6,7,8,9};
        String s;

        try{
          double d = myMethod(8, 8);
            }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            //boolean z = myMethod1(x, y);
            System.out.println(myMethod1(x, y));
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getSuppressed());
        }
        try{
            printString(null);
        }catch (NullPointerException n) {
            System.out.println("null");
        }
        try{
            double k = myMethod2(2, 2);
        }catch (NullPointerException n){
            System.out.println("Something went wrong!");
        }
     }
    public static int myMethod (int a, int b) throws ArithmeticException {
        if (a == b) {
            throw new MyException("a == b");
        }
        return a % b;
    }
    public static boolean myMethod1 (int[] x, int[] y) throws IndexOutOfBoundsException {
        if (Arrays.equals(x, y)) {
            throw new IndexOutOfBoundsException();
        }
        return Arrays.equals(x, y);
    }
      static void printString(String s) throws NullPointerException {
        if (s == null) {
            throw new NullPointerException("null");
        }
          System.out.println(s);
    }
    public static int myMethod2(int a, int b) throws NullPointerException {
        if(a == 2 && b == 2){
            throw new NullPointerException();
        }
        return a*b/a-b;
    }
}
