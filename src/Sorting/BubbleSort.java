package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
//array input---------------
        for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt(); }
        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);}
//bubble sort---------------
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
           //------swap------
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }}}
//array output--------------
        System.out.println("sorted Array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
