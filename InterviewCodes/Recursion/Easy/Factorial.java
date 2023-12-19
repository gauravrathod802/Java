package InterviewCodes.Recursion.Easy;

public class Factorial {
    public static void main(String[] args) {
        int n=4;
        int fact=factorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }

    static int factorial(int n) {
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
