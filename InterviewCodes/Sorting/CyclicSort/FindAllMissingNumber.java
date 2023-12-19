package InterviewCodes.Sorting.CyclicSort;

import java.util.*;

class FindAllMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,7,8,4,5,5,5}; //3 6
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> arrList=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                arrList.add(i+1);
            }
        }
        return arrList;
    }
    static void swap(int nums[],int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}