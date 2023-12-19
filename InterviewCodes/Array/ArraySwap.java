package InterviewCodes.Array;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
    int arr[]={10,20,30,40,50};
    swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[],int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}