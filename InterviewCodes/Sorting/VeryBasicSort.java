package InterviewCodes.Sorting;

import java.util.Arrays;

//simplified illustration of the process of finding the minimum element in an unsorted array and placing it in a sorted array.
public class VeryBasicSort{
    public static void main(String[] args) {
        int[] arr={10,5,20,8,2,15};
        int sortedArray[]= basicSort(arr);
        System.out.println(Arrays.toString(sortedArray));

    }
    static int[] basicSort(int arr[]){
        int[] sortedArray=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min=Integer.MAX_VALUE;
            int minIndex=-1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            sortedArray[i]=min;
            arr[minIndex]=Integer.MAX_VALUE;   //by this statement we eliminating it from further minimum element process
        }
        return sortedArray;
    }
}
