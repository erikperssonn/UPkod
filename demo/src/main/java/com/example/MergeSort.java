package com.example;

public class MergeSort {
    public static void mergeSortDouble(double[] arr) {
        if (arr == null || arr.length <= 1)
            return;
        
        mergeSortDouble(arr, 0, arr.length - 1);
    }
    
    private static void mergeSortDouble(double[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            mergeSortDouble(arr, left, mid);
            mergeSortDouble(arr, mid + 1, right);
            
            mergeDouble(arr, left, mid, right);
        }
    }
    
    private static void mergeDouble(double[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        double[] L = new double[n1];
        double[] R = new double[n2];
        
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        
        int i = 0, j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static void mergeSortString(String[] arr) {
        if (arr == null || arr.length <= 1)
            return;
        
        mergeSortString(arr, 0, arr.length - 1);
    }
    
    private static void mergeSortString(String[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            mergeSortString(arr, left, mid);
            mergeSortString(arr, mid + 1, right);
            
            mergeString(arr, left, mid, right);
        }
    }
    
    private static void mergeString(String[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        String[] L = new String[n1];
        String[] R = new String[n2];
        
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        
        int i = 0, j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
