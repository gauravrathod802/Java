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



    public static class CheckSubset {
        static boolean checkSubset(int a1[], int a2[], int m, int n) {
            int i=0;
            int j=0;
            for (i = 0; i < n; i++) {

                for (j = 0; j < m; j++)
                    if (a2[i] == a1[j])
                        break;
                if (j == m)
                    return false;
            }
            return true;
        }
        public static void main(String[] args) {
            int[] a1 = { 10, 70, 60, 40, 30 };
            int[] a2 = { 10 };
            int m = a1.length;
            int n = a2.length;

            if (checkSubset(a1, a2, m, n))
                System.out.println("yes");
             else
                System.out.println("no");
        }
    }
}
