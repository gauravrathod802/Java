package TreakyQuestions;

public class ExceptionClass {
    public int m1(){
        try{
            return 1;
        }catch (Exception e){
            return 2;
        }
        finally {
            return 3;
        }
    }
    public static void main(String[] args) {
        ExceptionClass ec=new ExceptionClass();
        System.out.println(ec.m1());
    }
}
