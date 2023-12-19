package Exception;

public class AccountNumberNotMatchException extends RuntimeException{
    AccountNumberNotMatchException(String msg){
        System.out.println(msg);
    }
}

class Test{
    public static int myAccount=9211;
    public static float myBalance=4500.0f;

    public static void myBalance(int accNumber){
        if(myAccount==accNumber){
            System.out.println("My Account Balance is :" +myBalance);
        }else {
            throw new AccountNumberNotMatchException("Account Number is Wrong please enter correct account number!");
        }

    }
    public static void main(String[] args) {
        myBalance(9210);
}
}