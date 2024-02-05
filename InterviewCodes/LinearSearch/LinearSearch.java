package InterviewCodes.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={10,90,60,78,77};
        System.out.println(search(arr,78 ));
    }
    static int search(int[] arr, int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]==target){
                System.out.print("Element found at index:");
                return i;
            }
        }
        System.out.print("Element not found :(");
        return Integer.MAX_VALUE;
    }
}
