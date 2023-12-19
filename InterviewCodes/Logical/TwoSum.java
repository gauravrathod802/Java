package InterviewCodes.Logical;



//given an array of integer , return indices of two no such that they add upto a specific target.
//        ex:
//        arr=[2,7,11,15];
//        target=9, the fun should return [0,1]
class TwoSum {
public static void main(String args[]){
int arr[]={2,7,11,15};
int target=9;
sum(arr,target);

}
static void sum(int arr[],int target){
for(int i=0;i<arr.length;i++){
for(int j=1;j<arr.length;j++){
 if(arr[i]+arr[j]==target){
	System.out.println(arr[i]+""+arr[j]);
}

}
}
}
}