package InterviewCodes.Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int arr[]={1,4,9,20,59,90,999};
        int target=90;
        System.out.println(BS(arr,target,0,arr.length-1));
    }
    static int BS(int arr[],int target,int start,int end){
        int mid=start+(end-start)/2;
        if(start > end){
            return -1;
        }
        if (arr[mid]==target){
            return mid;
        }
        if (target > arr[mid]){
            return BS(arr,target,mid+1,end);
        }
        return BS(arr,target,start,mid-1);

    }
}
