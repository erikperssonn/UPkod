package com.example;

public class QuickSort {
    public static void quickSortDouble(double[] arr) {
        if (arr == null || arr.length <= 1)
            return;
        
        quickSortDouble(arr, 0, arr.length - 1);
    }
    
    private static void quickSortDouble(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionDouble(arr, low, high);
            
            quickSortDouble(arr, low, pi - 1);
            quickSortDouble(arr, pi + 1, high);
        }
    }
    
    private static int partitionDouble(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swapDouble(arr, i, j);
            }
        }
        
        swapDouble(arr, i + 1, high);
        return i + 1;
    }
    
    private static void swapDouble(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void quickSortString(String[] arr) {
        if (arr == null || arr.length <= 1)
            return;
        
        quickSortString(arr, 0, arr.length - 1);
    }
    
    private static void quickSortString(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionString(arr, low, high);
            
            quickSortString(arr, low, pi - 1);
            quickSortString(arr, pi + 1, high);
        }
    }
    
    private static int partitionString(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swapString(arr, i, j);
            }
        }
        
        swapString(arr, i + 1, high);
        return i + 1;
    }
    
    private static void swapString(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
