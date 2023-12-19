package InterviewCodes.Logical;

import java.util.Arrays;

public class SecondLargestFromArray {
    public static void main(String[] args) {
        int arr[]={10,20,65,34,90,1000};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-3]);  //arr[3]

    }
}
