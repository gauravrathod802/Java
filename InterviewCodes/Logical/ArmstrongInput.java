package InterviewCodes.Logical;

import java.util.Scanner;

public class ArmstrongInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number to check whether it is Armstrong or not:");
        int inp= sc.nextInt();
        System.out.println( check(inp));
    }
    static int countNumber(int n){
        int count=0;
        while(n>0){
//            int rem=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
    static boolean check(int n1){
        int count=countNumber(n1);
        int sum=0,original=n1;
        while(n1>0) {
            int rem = n1 % 10;
            sum = (int) (sum + PowerFunction.power(rem,count));
            n1=n1/10;
        }
        return sum==original;
    }
}
