package com.c231163.find_b;
import java.util.Scanner;
public class Find_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int C = sc.nextInt();
        if((A + C) % 2 == 0){
            int B = (A + C) / 2;
            System.out.println(B);
        } else {
            System.out.println("Not integer");
        }
    }
}