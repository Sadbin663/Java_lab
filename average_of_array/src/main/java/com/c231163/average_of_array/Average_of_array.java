//set_2
package com.c231163.average_of_array;
public class Average_of_array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average = " + avg);
    }
}