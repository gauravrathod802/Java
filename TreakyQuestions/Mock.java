package TreakyQuestions;
//random number
public class Mock {
    public static void main(String[] args) {
        int number=12345;
        int sum=0;
        while(number>0){  //12345
            int rem=number%10; //5  4   3
            sum = sum+rem;  //5 +4 +3
            number=number/10; //1234   //123
        }
        System.out.println(sum);
    }
}
