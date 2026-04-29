//set_3
package com.c231163.workhours;
import java.util.Scanner;
public class WorkHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int total = 0;
        for(int i=1;i<=7;i++){
            if(i==3) total += X-1;
            else if(i==6) total += X+1;
            else total += X;
        }
        System.out.println(total);
    }
}