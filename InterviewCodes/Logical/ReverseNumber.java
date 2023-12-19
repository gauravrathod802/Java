package InterviewCodes.Logical;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=56746470;
        int reverse=0;
        while(n>0){
            int rem=n%10;
//            reverse=reverse*10+rem;
//            reverse= reverse+ rem;
            System.out.print(rem);
            n=n/10;
        }
//        System.out.println(reverse);

    }
}
