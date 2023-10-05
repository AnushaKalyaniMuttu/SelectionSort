package com.bean;

import java.util.*;

public class SelectionSort{
 public static void main (String [] args){
int arr[7]={1,22,3,-5,13,55,-3};
int largest=0
int lastUnsortedIndex;

   for (lastUnsortedIndex>arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
     for(int i=0;i<lastUnsortedIndex;i++){
    if(arr[i]>arr[largest]){
     largest=i;
    }
       swap(arr,largest,lastUnsortedIndex);
     }
 }

   public static void swap(int[] arr, int largest, int lastUnsortedIndex){
    int temp=arr[largest];
     arr[largest]=arr[lastUnsortedIndex];
     arr[lastUnsortedIndex]= arr[largest];
     }
}
