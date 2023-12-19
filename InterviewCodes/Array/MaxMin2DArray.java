package InterviewCodes.Array;

import java.util.Arrays;

public class MaxMin2DArray {
    public static void main(String[] args) {
        int arr[][]={
                {20,90,50,100},
                {30,50,40,10},
                {500,1000,1}
        };
        maxMin(arr);
    }
    static void maxMin(int arr[][]){
        int max=arr[0][0];
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 1; col <arr[row].length ; col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]<min){
                    min=arr[row][col];
                }
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

    public static class ChangeValue {
        public static void main(String[] args) {
            int a[]={2,3,4,57,6};
            changeValue(a);
            System.out.println(Arrays.toString(a));
        }
        static void changeValue(int arr[]){
             arr[4]=89;

        }
    }
}
