/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.putalisadaksuperbike.controller;

/**
 *
 * @author yonza
 */
public class BinarySearchAlgorithm {
    

    public int searchString(String[] arr, int low, int high, String searchKey){
        if(high>=low){
            int mid = (low + high)/2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid].equals(searchKey))
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid].compareTo(searchKey)>0)
                return searchString(arr, low, mid - 1, searchKey);
 
            // Else the element can only be present
            // in right subarray
            return searchString(arr, mid + 1, high, searchKey);
        }
        return -1;
    }

    public int searchInt(int[] arr, int low, int high, int searchKey){
        if(high>=low){
            int mid = (low + high)/2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == searchKey)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > searchKey)
                return searchInt(arr, low, mid - 1, searchKey);
 
            // Else the element can only be present
            // in right subarray
            return searchInt(arr, mid + 1, high, searchKey);
        }
        return -1;
    }

}


