//set_2
package com.c231163.smallest_num_array;
public class Smallest_num_array {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15};
        int min = arr[0];
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }
        System.out.println("Smallest = " + min);
    }
}
