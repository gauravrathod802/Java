package InterviewCodes.Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
            int arr[]={5,4,3,2,1};
            cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int arr[]){
        int start=0;
        while(start < arr.length){
            int correct=arr[start]-1;
            if(arr[start]!=arr[correct]){
                swap(arr,start,correct);
            }else{
                start++;
            }
        }
    }
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
