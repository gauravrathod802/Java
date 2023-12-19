package InterviewCodes.Recursion.Easy;

public class Sum {
    public static void main(String[] args) {
        int n=4;
        int s=sum(n);
        System.out.println("Sum of number "+n+" is "+s);
    }

    static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n+sum(n-1);
    }
}
