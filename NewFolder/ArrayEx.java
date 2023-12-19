package NewFolder;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr= new int[4];
        for(int i=0; i<arr.length;i++){
             arr[i]= sc.nextInt();
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(Arrays.toString(arr));
//        System.out.println(arr[4]);   gives runtime error bcoz array size is 4, and it is accessing the 5th element


//        int[][] arr2D=new int[3][3];         //[rows][columns]  if we do not specify rows it will give error, but it is not same about columns
//        arr2D[1]= new int[]{10};                //rows1
//        arr2D[0]=new int[]{10,202,90};          //rows0
////        arr2D[2][0]=20;
//        arr2D[2]= new int[]{19, 90, 80, 60, 30, 100,99, 98, 88, 10,22};  //rows2
//        arr2D[3]=new int[]{20,89};    //row3 index 4
//        System.out.println(arr2D[2][10]);
////        System.out.println(arr2D[3][1]);


    }
}
