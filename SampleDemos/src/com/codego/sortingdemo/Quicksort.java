/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package com.codego.sortingdemo;

/**
 *
 * @author jheso
 */
public class Quicksort {
    
    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        System.out.println("Pivot:" + pivot);
        System.out.println("Left Index:" + low);
        
        int i = low - 1;
        for (int j = low; j < high; j++) {
            System.out.println("j:" + j);
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
            System.out.println("i:" + i);
        }
        swap(arr, i+1, high);
        return i+1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void quickSort(int[] arr, int low, int high){
        System.out.print("Array: [");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }        
    }   
        
}
