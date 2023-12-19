package InterviewCodes.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={10,90,60,78,77};
        System.out.println(search(arr,79));
    }
    static int search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]==target){
                System.out.print("Element found at index:");
                return i;
            }
        }
        System.out.print("Element not found :(");
        return -1;
    }
}
