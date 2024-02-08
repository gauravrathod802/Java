package InterviewCodes.Array;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {10,80,90,50},
                {8,5,8,3},
                {34,89,45,23}
        };
        int target=500;
        int []ans=searchIn2DArray(arr,target);
        System.out.println(Arrays.toString(ans));
    }
//    time complexity is O(i*j) = O(n^2)
    static int[] searchIn2DArray(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
