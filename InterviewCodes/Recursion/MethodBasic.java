package InterviewCodes.Recursion;

public class MethodBasic {
    public static void main(String[] args) {
        method();
    }
    static void method(){
        System.out.println("hello");
        method1();
    }
    static void method1(){
        System.out.println("hello");
        method2();
    }
    static void method2(){
        System.out.println("hello");
        method3();
        System.out.println("method3 cleared from stackFrame");
    }
    static void method3(){
        System.out.println("hello");
    }
}
