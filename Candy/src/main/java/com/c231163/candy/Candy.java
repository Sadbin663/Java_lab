//set_3
package com.c231163.candy;
import java.util.Scanner;
public class Candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int need = N - X;
        int packets = (need + 3) / 4;
        System.out.println(packets);
    }
}