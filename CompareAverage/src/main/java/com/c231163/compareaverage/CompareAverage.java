//set_3
package com.c231163.compareaverage;
import java.util.Scanner;
public class CompareAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if((A + B) / 2 > C)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}