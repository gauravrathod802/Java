package InterviewCodes.BinarySearch;

import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int arr[][]={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };
        System.out.println(Arrays.toString(search(arr,33)));

    }
    static int[] search(int[][] matrix,int target){
        int row=0;
        int col=matrix.length-1;
        while(row < matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[] {row,col};
            }
            if(target > matrix[row][col]){
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
