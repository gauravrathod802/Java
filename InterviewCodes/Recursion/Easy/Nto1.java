package InterviewCodes.Recursion.Easy;

public class Nto1 {
    public static void main(String[] args) {
//        fun(5);
//        funRev(5);
//        funBoth(5);
        concept(5);
    }
    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
//        concept(n--);         //this will give error stackoverflow
        concept(--n);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n){
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
    static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        funBoth(n-1);
        System.out.print(n+" ");
    }
}