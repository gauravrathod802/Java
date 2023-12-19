package InterviewCodes.BinarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,9,15,17,18};
        int target=12;
        int ans=ceiling(arr,target);
        System.out.println(ans);
    }
    // ceiling in array means the smallest number greater than or equal to (>=) target
    static int ceiling(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start] < arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }

        }

        return start;
    }
}
