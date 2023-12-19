package InterviewCodes.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int arr[]){
        for(int i=0;i < arr.length;i++){
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j] < arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
/*
* int[] sort(int arr[]){
* for(int i=0;i<arr.length;i++){
* for(int j=1;i<arr.length--i;i++){
* if(arr[j]<arr[j-1]){
* int temp=arr[j];
* arr[j]=arr[j-1];
* arr[j-1]=temp;
* }
* }
* }
* return arr;
* }
* */