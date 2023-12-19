package InterviewCodes.BinarySearch;

import java.util.Arrays;

public class MountainPeakElement {
    public static void main(String[] args) {
        int[] nums ={1,2,1,3,5,6,10,5,20};
        int ans=findPeakElement(nums);
        System.out.println(ans);
    }
     static int findPeakElement(int[] nums) {
            int start=0;
            int end=nums.length-1;
            while(start < end){
                int mid=start+(end-start)/2;
                if(nums[mid] > nums[mid+1]){
                    end=mid;
                }else{
                    start=mid+1;
                }
            }
            return nums[end];
    }
}

