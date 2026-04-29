//set_3
package com.c231163.waterbottle;
import java.util.Scanner;
public class WaterBottle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int empty = 0;
        if(a==0) empty++;
        if(b==0) empty++;
        if(c==0) empty++;
        if(empty >= 2)
            System.out.println("Water filling time");
        else
            System.out.println("Not now");
    }
}