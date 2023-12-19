package InterviewCodes.Logical;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int num=sc.nextInt();
        System.out.print("Enter Power:");
        int power=sc.nextInt();
        System.out.println(power(num,power));
//        int i=1;
//        int result=num;
//        while(i<power){
//            result=result*num;
//
//            i++;
////            break;
//        }
//        System.out.println(result);
    }
    static int power(int num,int power){
        int i=1;
        int result=num;
        while (i<power){
            result=result*num;
            i++;
        }
        return result;
    }
}
