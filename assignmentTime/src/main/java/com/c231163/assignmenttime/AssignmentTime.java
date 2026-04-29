//set_3
package com.c231163.assignmenttime;
import java.util.Scanner;
public class AssignmentTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 5)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}