package InterviewCodes;

public class Shadowing {
    static int x=40;
    public static void main(String[] args) {
        System.out.println(x);
        int x=60;
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
