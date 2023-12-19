package Irise;

public class AccessSpecifier {
    private int a=10;
    protected int b=20;
    public String name="gaurav";
    float cgpa=8.5f;                                //default access specifier
    public static void main(String[] args) {
        AccessSpecifier as=new AccessSpecifier();
        System.out.println(as.a);
    }
}
class AccessSpecifier2{
    public static void main(String[] args) {
        AccessSpecifier access=new AccessSpecifier();
//      System.out.println(accessSpecifier.a);    not accessible because it has private access to the class only
        System.out.println(access.b);              //protected
        System.out.println(access.name);          //public
        System.out.println(access.cgpa);         //default
    }
}
