package InterviewCodes.Array;

public class SearchInArray {
    public static void main(String[] args) {
        int [] arr={10,80,90,77,44};
        int target=77;
        System.out.println(search(arr,target));
        System.out.println(searchInRange(arr,target,2,4));
    }
    static int search(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                System.out.print("Element found at index: ");
                return i;
            }
        }
        return -1;
    }
    static int searchInRange(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i< end;i++){
            if(arr[i]==target){
                System.out.print("Element found at index: ");
                return i;
            }
        }
        return -1;
    }
}
