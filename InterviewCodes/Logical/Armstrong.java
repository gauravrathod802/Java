package InterviewCodes.Logical;


import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//       int num=371, remainder,result=0, original;
//        original=num;
//
//        while(num>0){
//            remainder=num%10;
//            result=(int) (result+Math.pow(remainder, 3));
//            num=num/10;
//        }
//
//        if(original==result){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int count=0;
//        System.out.println(isArmstrong(n1));

//        for (int i=1000;i<9999;i++){
//            if(fourDigitArmstrong(i)){
//                System.out.print(i+" ");


        while(n>0){
            int rem=n%10;
            count++;
            n=n/10;
        }
//        System.out.println(count);

        int sum=0,original=n;
        while(n>0){
            int rem=n%10;
            sum= (int) (sum+Math.pow(rem,count));
            n=n/10;
        }
        if(sum==original){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }





//            }
//        }
    }
//    static boolean isArmstrong(int n){
//        int rem,sum=0;
//        int original=n;
//
//        while(n>0) {
//            rem = n % 10;
//            sum = sum + (rem * rem * rem);
//            n = n / 10;
//
//        }
//        if(sum==original){
////            System.out.println("yes");
//                return true;
//        }
//        else{
////            System.out.println("no");
//            return false;
//        }
        //return sum==original;



//    static boolean fourDigitArmstrong(int n){
//        int sum=0,original=n;
//        while(n>0){
//            int rem=n%10;
//            sum= (int) (sum+Math.pow(rem,4));
//            n=n/10;
//
//        }
//
//        return sum==original;
//    }




//    static boolean checkArmstrong(int n){
//
//    }
    
}
