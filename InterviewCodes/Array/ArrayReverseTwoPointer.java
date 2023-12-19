package InterviewCodes.Array;

import java.util.Arrays;
//by using two pointer method we are going to reverse the array
// basically two pointer means using start and end as two points

public class ArrayReverseTwoPointer {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
