//set_2
package com.c231163.sort_array;
import java.util.Arrays;
public class Sort_array {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        for(int i : arr){
            System.out.println(i);
        }
    }
}