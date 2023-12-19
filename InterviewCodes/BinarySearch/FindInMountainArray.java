package InterviewCodes.BinarySearch;

//mountain array is also called as bitonic array which has strictly ascending and then strictly descending order of array

public class FindInMountainArray {
    public static void main(String[] args) {
        int arr[]={0, 1, 3, 4, 5, 3, 2};
        int target=2;
//        System.out.println(peakElement(arr));
        System.out.println(findIndex(arr,target));

    }
    static int findIndex(int arr[], int target){
        int firstTry=orderAgnosticBinarySearch(arr,target,0,peakElement(arr));
        if(firstTry!=-1){
            return firstTry;
        }

        return orderAgnosticBinarySearch(arr,target,peakElement(arr),arr.length-1);
    }
    static int orderAgnosticBinarySearch(int[] arr,int target,int start,int end){
        boolean isAsc=arr[start] < arr[end];
        while(start<=end){
            int mid=start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }else{
                if(target < arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    static int peakElement(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int mid=start+ (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
