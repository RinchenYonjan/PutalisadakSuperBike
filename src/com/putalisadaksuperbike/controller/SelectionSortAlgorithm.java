/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.putalisadaksuperbike.controller;

/**
 *
 * @author yonza
 */

//creating class
public class SelectionSortAlgorithm {
 
    //creating method 
    public int[] selectionsortascending(int[] array){
        int size = array.length;
        
        for(int step = 0; step < size - 1; step++){
            int min_idx = step;
            
            for(int i = step + 1; i < size; i++){
                
                if(array[i] < array[min_idx]){
                    min_idx = i;
                }
                
            }
            
            //number swap
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        
        }
        return array;
    }
    
     public int[] selectionsortdescending(int[] array){
        int size = array.length;
        
        for(int step = 0; step < size - 1; step++){
            int min_idx = step;
            
            for(int i = step + 1; i < size; i++){
                
                if(array[i] > array[min_idx]){
                    min_idx = i;
                }
                
            }
            
            //number swap
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        
        }
        return array;
    }
}
