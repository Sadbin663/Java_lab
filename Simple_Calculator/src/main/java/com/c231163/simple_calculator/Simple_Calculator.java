//set_1
package com.c231163.simple_calculator;
import java.util.Scanner;
public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);f
        switch(op){
            case '+': System.out.println(a+b); break;
            case '-': System.out.println(a-b); break;
            case '*': System.out.println(a*b); break;
            case '/': System.out.println(a/b); break;
        }
    }
}