package InterviewCodes.Logical;

public class Swap {
    public static void main(String[] args) {
        int a=10, b=20, temp;

        System.out.println("Before Swapping a="+a+" "+"b= "+b);
        temp=a;
        a=b;
        b=temp;

        System.out.println("Value of a = "+a+" "+"Value of b = "+b);
    }
}
