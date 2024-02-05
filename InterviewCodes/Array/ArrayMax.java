package InterviewCodes.Array;

import java.util.Arrays;

public class ArrayMax {
    public static void main (String[] args) {
        int[] arr={20,90,60,100,900,10};

        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(maxRange(arr,0,2));
    }
    static int max(int arr[]){
//        edge cases
        if(arr.length==0){
            return -1;
        }
        int maxValue=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
    static int min(int arr[]){
        int minValue=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<minValue){
                minValue=arr[i];
            }
        }
        return minValue;
    }
    static int maxRange(int arr[],int start, int end){
//        below are two edge cases
        if(end>start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int maxValue=arr[start];
        for (int i=start;i<=end;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
}
