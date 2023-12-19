package WrapperClass;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        int a=10;
        Integer b=a;            //autoboxing: converting primitive to object
        System.out.println(b);

        int c=b;                //unboxing: converting object to primitive
        System.out.println(c);
    }
}
