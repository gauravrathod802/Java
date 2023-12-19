package InterviewCodes.Logical;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number to check whether it is palindrome or not:");
      //  int num=sc.nextInt();
        int num=151;
        int  reverse=0, remainder;
        int original=num;

        while(num>0){
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }

        if(original==reverse){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
    
}
