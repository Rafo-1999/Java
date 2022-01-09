package com.company;

public class Calculator {
    int c;
    public void addition (int a,int b){
        c =a + b;
        System.out.println("Gumarum" + c);
    }
    public void subtraction (int a, int b){
        c = a - b;
        System.out.println("Hanum" + c);
    }
}
  class MyCalculator extends Calculator {
    public void multiplication (int a,int b){
        c = a * b;
        System.out.println("Bazmapatkum" + c);
    }
 }
