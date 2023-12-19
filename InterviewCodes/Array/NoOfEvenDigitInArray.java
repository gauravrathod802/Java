package InterviewCodes.Array;

import java.util.Arrays;

public class NoOfEvenDigitInArray {
    public static void main(String[] args) {
        int arr[]={1,7,9,456,9};
        System.out.println(findNumber(arr));

    }
    static int findNumber(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int digit=countDigit(num);
        if(digit%2==0){
            return true;
        }
        return false;
    }

    static int countDigit(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    public static class SearchIn2DArray {
        public static void main(String[] args) {
            int arr[][]={
                    {10,90,70,30},
                    {80,7,60},
                    {40,20,9}
            };
            int[] ans=index(arr,0);
            System.out.println(search(arr,9));
            System.out.println(Arrays.toString(ans));
        }
        static boolean search(int arr[][], int target){
            for (int rows = 0; rows <arr.length ; rows++) {
                for (int cols = 0; cols < arr[rows].length; cols++) {
                    if(arr[rows][cols]==target){
                        return true;
                    }

                }
            }
            return false;
        }
        static int[] index(int arr[][],int target){
            for (int rows = 0; rows < arr.length; rows++) {
                for (int cols = 0; cols < arr[rows].length; cols++) {
                    if(arr[rows][cols]==target){
                        return new int[]{rows,cols};
                    }

                }
            }
            return new int[]{-1,-1};
        }

    }
}
