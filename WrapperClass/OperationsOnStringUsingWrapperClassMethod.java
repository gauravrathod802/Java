package WrapperClass;

public class OperationsOnStringUsingWrapperClassMethod {
    public static void main(String[] args) {
        String s="gaurav@%#122";
        char[] ch=s.toCharArray();
        for (char i:ch) {
            if(Character.isDigit(i) || Character.isAlphabetic(i)){
//                System.out.print(i);
                continue;
            }else {
                System.out.print(i);
            }
        }
    }
}
