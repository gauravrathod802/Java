package Assignment;
//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sum=0;
        String s=sc.next();
        while(true){
            int a=sc.nextInt();
            sum=sum+a;
            if(s=="x"){
                System.out.println("Enter valid input");
                break;
            }

        }
        System.out.println(sum);
    }
}
