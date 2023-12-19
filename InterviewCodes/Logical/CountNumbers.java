package InterviewCodes.Logical;

public class CountNumbers {

//    count number of 3 are there in 37262327
    public static void main(String[] args) {
        int n=37262327;
        int count=0;

        while(n>0){
            int rem=n%10;
            if(rem==3){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);

    }
}
