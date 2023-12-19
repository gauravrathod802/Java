package Irise;
//Types of methods:
//1. Instance method/ Non-Static method
//2. Static method
public class Calculator {
    static void addition(){
        int a=100;
        int b=20;
        int add=a+b;
        System.out.println("Addition is= "+add);
    }
    static void substraction(){
        int a=100;
        int b=20;
        int sub=a-b;
        System.out.println("Substraction is= "+sub);
    }
    static void multiplication(){
        int a=100;
        int b=20;
        int mul=a*b;
        System.out.println("Multiplication is= "+mul);
    }
    static void division(){
        int a=100;
        int b=20;
        int div=a/b;
        System.out.println("Division is= "+div);
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.toString());
        addition();
        substraction();
        multiplication();
        division();
    }
}
