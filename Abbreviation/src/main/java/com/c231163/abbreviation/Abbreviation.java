//_3set
package com.c231163.abbreviation;
import java.util.Scanner;
public class Abbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length() > 10){
            System.out.println("" + s.charAt(0) + (s.length()-2) + s.charAt(s.length()-1));
        } else {
            System.out.println(s);
        }
    }
}