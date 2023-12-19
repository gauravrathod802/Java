package InterviewCodes.Recursion;

public class NumberExampleWithRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        //base condition or termination condition
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");

        //recursive call
        //if you are calling a function again, and again you can treat it as a separate call in the stack
        // this is called tail recursion
        //this is the last function call
        print(n+1);
    }
}

//If we don't any base condition then the program will get stackoverflow exception, and it is runtime exception

//why recursion?
//* It helps us in solving bigger/complex problem in a simple way.
//* You can convert recursion solution into iteration and vice versa.
//* Space complexity is not constant because recursive calls.
//* It helps us in breaking down bigger problem into smaller problems.

