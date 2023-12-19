package Irise;

public class ConstructorDemo {
    int j;
    ConstructorDemo(){
//        new ConstructorDemo(20);  calling one constructor from another constructor
        this(20);
    }
    ConstructorDemo(int i){
       this.j=i;
        System.out.println(j);
        System.out.println("hello from constructor");
    }

    public static void main(String[] args) {
        ConstructorDemo d=new ConstructorDemo();
        d.method();
//            System.out.println("hello from constructor");
        }



    void method(){
        System.out.println("hello");
    }
}
//class A{
//    final int a;
//}