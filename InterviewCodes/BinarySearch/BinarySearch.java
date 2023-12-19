package InterviewCodes.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
//        int [] arr={10,20,40,50,90,100,110,150,160};
        int arr[]={90,80,70,60,50,40,30,20,10};
        int target=20;
        System.out.println(search(arr,target));
//        System.out.println(end);
    }
    static int search(int[] arr,int target){
       int start=0;
       int end=arr.length-1;

//       while(start <= end){
//           int mid=start + (end - start)/2;                               //0+(9-0)/2;  //4    //90 mid element
//           if(target < arr[mid]) {       //150 < 90
//               start = mid + 1;                                           //end =mid-1    if array is ascending
//           }else if(target > arr[mid]){     //10 >50
//               end=mid - 1;                                               // start=mid+1  if array is ascending
//           }else{
//               return mid;
//           }
//       }


       for(start=0;start<=end;){
           int mid=start + (end - start)/2;                               //0+(9-0)/2;  //4    //90 mid element
           if(target < arr[mid]) {       //150 < 90
               start = mid + 1;                                           //end =mid-1    if array is ascending
           }else if(target > arr[mid]){     //10 >50
               end=mid - 1;                                               // start=mid+1  if array is ascending
           }else{
               return mid;
           }
       }

       return -1;
    }
}
