package InterviewCodes.BinarySearch;

public class OrderAgnosticBinarySearch {
    static int a=10;
    public static void main(String[] args) {
        int arr[]={90,80,70,60,50,40,30,20,10,0,-10,-20,-30};
        int target=80;
        int ans=orderAgnosticBinarySearch(arr,target);
        System.out.println(ans);

    }
    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start=0;
        int end =arr.length-1;

        boolean isAsc=(arr[start]<arr[end]);
        /*
        boolean isAsc;
        if(arr[start]<arr[end]){
        isAsc=true;
        }else{
        isAsc=false;
        }
        */

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }else{
                if(target<arr[mid]) {
                    start = mid + 1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

}

