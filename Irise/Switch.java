package Irise;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char ch=sc.next().charAt(0);
        System.out.println(Calculator(a,b,ch));
    }
    static int Calculator(int a, int b,char ch){
        switch (ch){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            case '%':
                return a%b;
            default:
                System.out.println("Please Valid input");
        }
       return -1;
    }
}
