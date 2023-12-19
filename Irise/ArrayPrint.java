package Irise;

public class ArrayPrint {
    public static void main(String[] args) {
        int [] arr={20,40,90,50};
        int [][] arr1={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        arrayPrint(arr,arr1);
    }
    static void arrayPrint(int arr[],int arr1[][]){
        for (int print:arr) {
            System.out.print(print+" ");
        }
        System.out.println();
        System.out.println("2D Array: ");
        for(int rows=0;rows<arr1.length;rows++){
            for (int col = 0; col <arr1[rows].length ; col++) {
                System.out.print(arr1[rows][col]+" ");
            }
            System.out.println();
        }
    }
}
