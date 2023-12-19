package TreakyQuestions;

public class CodingChallenge {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c=a || (b=true);  // false
//        boolean c1=a && (b=true);  true
        System.out.println(b);
    }
}

//In the statement third boolean c there is a || operator which is checking only one condition and in second condition we are assigning the b=true
//so if we are using the && operator we will get the output as true but while using the operator it is only checking the first condition, and it is found
//it to be true, so it is not checking for second condition and if we are using && operator then it will check both the condition the first one is true
//or not it will check both the condition.