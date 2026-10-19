package org.RecursionPractice;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }



   static int[] mergeSort(int[]brr){
        if (brr.length==1){
            return brr;
        }
        int mid=brr.length/2;

        int[] left= mergeSort(Arrays.copyOfRange(brr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(brr,mid,brr.length));

        return merge(left,right);
   }
   static int[] merge(int[] start , int[] end){

        int[] mix=new int[start.length+end.length];

        int i=0;
        int j=0;
        int k=0;

        while (i<start.length && j<end.length){

            if (start[i]<end[j]){
                mix[k]=start[i];
                i++;
            }
            else {
                mix[k]=end[j];
                j++;
            }
            k++;
        }
       //  it may be possible that one of the array is not complete
       while (i<start.length){
           mix[k]=start[i];
           i++;
           k++;
       }
       while (j<end.length){
           mix[k]=end[j];
           j++;
           k++;
       }
       return mix;
    }
}
