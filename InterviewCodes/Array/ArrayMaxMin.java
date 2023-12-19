package InterviewCodes.Array;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int arr[]={20,60,50,90,2000};
        maxInArray(arr);
    }
    static void maxInArray(int arr[]){
        int max=arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int min=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max+" "+min);
    }

}
