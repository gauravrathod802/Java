package InterviewCodes.Array;

public class SearchInRange {
        public static void main(String[] args) {
            int[] arr={10,20,90,60,40};
            int target=90;
            System.out.println(searchInRange(arr,target,1,4));
        }
        static int searchInRange(int arr[],int target,int start, int end){
            for (int i=start;i<=end;i++){
                if(arr[i]==target){
                    return i;
                }
            }
            return -1;
        }
    }

