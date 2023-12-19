package InterviewCodes.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSortWIthMinIndex {
    public static void main(String[] args) {
        int arr1[]={2,1,-3,0};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            int first=0+i;
            int minIndexV=minIndex(arr,first, arr.length-1);
            swap(arr,minIndexV,first);
        }
    }
    static void swap(int arr[] ,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    static int minIndex(int arr[],int start,int end){
        int min=start;
        for (int i = start; i <= end; i++) {
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;
    }
}
