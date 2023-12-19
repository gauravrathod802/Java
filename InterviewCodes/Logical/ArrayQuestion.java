package InterviewCodes.Logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayQuestion {
    public static void main(String[] args) {
        int arr[]={5,3,1,0,2,0};
        Arrays.sort(arr);
        List li=new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
            li.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                li.add(arr[i]);
            }
        }
        System.out.println(li);
    }
}



 class SortArrayWithZeros {
    public static void main(String[] args) {
        int[] inputArray = {5, 3, 1, 0, 2, 0};
        sortArrayWithZeros(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void sortArrayWithZeros(int[] arr) {
        int n = arr.length;

        // First, we'll sort the array to move non-zero elements to the beginning.
        Arrays.sort(arr);

        // Now, we'll count the number of zeros in the array.
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        // Move the zeros to the end of the array.
        for (int i = 0; i < n - zeroCount; i++) {
            arr[i] = arr[i + zeroCount];
        }

        // Fill the remaining elements with zeros.
        for (int i = n - zeroCount; i < n; i++) {
            arr[i] = 0;
        }
    }
}
