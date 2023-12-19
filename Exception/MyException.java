package Exception;

public class MyException {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();  // it will give total information about the exception occurred and its line number
        }
    }
}
