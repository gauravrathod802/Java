package InterviewCodes.Array;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4};
//        String arr[]={"bat","cat","null","cheat","null"};

        int n=removeDuplicate(arr);
        for (int i = 0; i <= n ; i++) {
            System.out.println(arr[i]);

        }
    }
    static int removeDuplicate(int arr[]){
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[count]!=arr[i]){
                count++;
                arr[count]=arr[i];
//                System.out.println(arr[count]);
            }
        }
        return count;
    }
}
