//set_2
package com.c231163.count_even_odd;
public class Count_even_odd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int even = 0, odd = 0;
        for(int i : arr){
            if(i % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}