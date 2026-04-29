//set_2
package com.c231163.large_in_array;
public class Large_in_array {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15};
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println("Largest = " + max);
    }
}