package Irise1;
import Irise.AccessSpecifier;

 class AccessSpecifier2 {

    public static void main(String[] args) {
        AccessSpecifier accessSpecifier=new AccessSpecifier();
        System.out.println(accessSpecifier.name);
//        System.out.println(accessSpecifier.cgpa);     default access specifier cannot be accessed from another package
//        System.out.println(accessSpecifier.b);          protected cannot be accessed from parent class of another package
    }

}
class Access extends AccessSpecifier{
    public static void main(String[] args) {
        Access ac=new Access();
        System.out.println(ac.b);    // accessible here because it is the subclass of AccessSpecifier in another package, and it will print 20
        System.out.println(ac.name);   //public
      //System.out.println(ac.cgpa);   default not accessible
    }
}
