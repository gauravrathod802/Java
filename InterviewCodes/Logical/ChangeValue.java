package InterviewCodes.Logical;

import java.util.Arrays;

public class ChangeValue {
        public static void main(String[] args) {
            int a[]={2,3,4,57,6};
            changeValue(a);
            System.out.println(Arrays.toString(a));
        }
        static void changeValue(int arr[]){
             arr[4]=89;

        }
    }