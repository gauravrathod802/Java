package Irise;

public class MethodWithParameter {
    static int addition(int a,int b){
        int add=a+b;
        return add;
    }
    static int substraction(int a, int b){
        int sub=a-b;
        return sub;
    }
    static int multiplication(int a,int b){
        int mul=a*b;
        return mul;
    }
    static int division(int a, int b){
        int div=a/b;
        return div;
    }

    static String Concatenation(String firstName,String lastName){
        String concat="Hello "+firstName+" "+lastName;
        return concat;
    }
    public static void main(String[] args) {
        System.out.println("Addition = "+addition(10,20));
        System.out.println("Substraction = "+substraction(90,20));
        System.out.println("Multiplication = "+multiplication(30,20));
        System.out.println("Division = "+division(50,10));

        System.out.println(Concatenation("Elon","Musk"));



    }
}
