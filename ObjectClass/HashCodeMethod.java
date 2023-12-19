package ObjectClass;

public class HashCodeMethod {
    public static void main(String[] args) {
        HashCodeMethod h=new HashCodeMethod();
        HashCodeMethod h1=h;

        System.out.println(h.hashCode());
        System.out.println(h1.hashCode());
        System.out.println(h==h1);

    }
}
