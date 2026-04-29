//set_3
package com.c231163.iiuc;
  import java.util.Scanner;
public class Iiuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int U = sc.nextInt();
        int V = sc.nextInt();
        System.out.println(Math.min(N * U, V));
    }
}