//set_2
package com.c231163.vowelconsonant;
public class VowelConsonant {
    public static void main(String[] args) {
        String s = "hello";

        int vowels = 0, consonants = 0;

        for(char ch : s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vowels++;
            else
                consonants++;
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}