//set_3
package com.c231163.topics;
import java.util.Scanner;
public class Topics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        if(X==A || X==B || X==C)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}