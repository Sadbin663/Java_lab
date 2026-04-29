//set_2
package com.c231163.palindrome_string;
public class Palindrome_String {
    public static void main(String[] args) {
        String s = "Tahmid";
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            rev += s.charAt(i);
        }
        if(s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}