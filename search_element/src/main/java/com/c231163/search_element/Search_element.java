//set_2
package com.c231163.search_element;
public class Search_element {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int key = 30;
        boolean found = false;
        for(int i : arr){
            if(i == key){
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}