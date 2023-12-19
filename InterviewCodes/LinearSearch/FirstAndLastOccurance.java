package InterviewCodes.LinearSearch;
import java.util.Arrays;

//worst  case time complexity is  o(n)
//this approach is  brute force
public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,5,8,4};
        int target=4;
        int ans[]={firstOccurance(arr,target),lastOccurance(arr,target)};
        System.out.println(Arrays.toString(ans));
    }
    static int firstOccurance(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){

                return i;
            }
        }
        return -1;
    }
    static int lastOccurance(int arr[],int target){
        for (int j = arr.length-1; j >= 0 ; j--) {
            if(arr[j]==target){
                return j;
            }
        }
        return -1;
    }

}
