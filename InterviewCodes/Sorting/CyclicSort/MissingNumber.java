package InterviewCodes.Sorting.CyclicSort;

//cyclic sort
public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={3,0,1};
        System.out.println(sort(arr));

    }
    static int sort(int arr[]){
        int i=0;
        while(i < arr.length){
            int correct=arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int arr[], int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
//    static void swap(int arr[], int first,int second,int third){
//        int temp=arr[first];
//        arr[first]=arr[second];
//        arr[second]=temp;
//    }

}


// Java program to find missing Number




class GFG {

    // Function to find the missing number
    public static int getMissingNo(int[] nums, int n)
    {
        int sum = ((n+1)*(n+2))/2;
        for (int i = 0; i < n; i++)
            sum -= nums[i];
        return sum;
//        int sum=0;
//        int total=((n+1)*(n+2))/2;
//        for (int i = 0; i < n; i++) {
//             sum=sum+nums[i];
//        }
//        return total-sum;
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        int N = arr.length;
        System.out.println(getMissingNo(arr, N));
    }
}
