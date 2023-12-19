package InterviewCodes.Array;


public class EvenOddInArray {
    public static void main(String[] args) {
        int arr[]={2,90,7,5,20};
//        int Even=findEven(arr);
//        System.out.println(Even);
          findEven(arr);
    }
    static void findEven(int[] arr){
        int Even=0, Odd=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                Even++;
            }
            else{
                Odd++;
            }
        }
        System.out.println(Even);
        System.out.println(Odd);
        //return count;

    }
}
