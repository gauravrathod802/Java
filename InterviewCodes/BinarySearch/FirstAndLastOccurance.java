package InterviewCodes.BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,4,5,8,9};
        int target=3;
        FirstAndLastOccurance fl=new FirstAndLastOccurance();
        int[] ans=fl.searchRange(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int first=search(nums,target,true);
        int last=search(nums,target,false);
        ans[0]=first;
        ans[1]=last;

        return ans;
    }
    int search(int nums[],int target,boolean isFirstIndex){
        int start=0;
        int end= nums.length-1;
        int ans=-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(target < nums[mid]){
                end=mid-1;
            }
            else if(target > nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(isFirstIndex==true){
                   end=mid-1;
                }
                else{
                    start=mid+1;

                }

            }
        }
        return ans;
    }
}
