package InterviewCodes.Recursion;

public class FibonacciNumberRecursion {
    public static void main(String[] args) {
        long ans=fiboFormula(50);
        System.out.println(ans);
    }
    static int fibo(int n){
        // this is base condition where if n is o or 1 it will return n only.
        if(n<2){
            return n;
        }
       return fibo(n-1)+fibo(n-2);
        //this formula is known as recurrence relation
    }

    static long fiboFormula(int n){
        return (long) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}


// break it down into smaller problems
// the base condition is represented by answers we already have.
/*
    fibo(2) is called.
        n is not less than 2, so it goes to the recursive step.
        It calls fibo(1) and fibo(0).
        fibo(1) returns 1 (base case).
        fibo(0) returns 0 (base case).
        The results are summed: fibo(1) + fibo(0) = 1 + 0 = 1.
        The final result of fibo(2) is 1.

 */