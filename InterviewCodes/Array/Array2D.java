package InterviewCodes.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        // 2 3 4
        // 3 5 6
        // 6 6 8
//direct array declaration
        int arr[][]={
                {1,5,6,9},
                {6,9,40,20,8},
                {1,2},
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

// input 2d array
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[3][3];

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col <arr1[row].length ; col++) {
                arr1[row][col]=sc.nextInt();
            }

        }
        for (int row = 0; row <arr1.length ; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.print(arr1[row][col]+" ");
            }
            System.out.println();
        }

        for (int row = 0; row < arr1.length ; row++) {
            System.out.println(Arrays.toString(arr1[row]));
        }
    }

}
