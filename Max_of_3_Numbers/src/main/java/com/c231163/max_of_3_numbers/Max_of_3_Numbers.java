//set_1
package com.c231163.max_of_3_numbers;
import java.util.Scanner;
public class Max_of_3_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();

        int max = Math.max(a, Math.max(b,c));
        System.out.println(max);
    }
}