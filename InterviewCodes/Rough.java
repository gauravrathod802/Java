package InterviewCodes;

public class Rough {
    int b=10;

    static void hello(){
//        System.out.println(b); non-static variable cannot be accessed from static context compile time error
        System.out.println("parent class hello");
    }
    void display(){
        System.out.println(b);
    }
}
class child extends Rough{
    static void childMethod(){
        System.out.println("hello from child class");
    }
    static void hello(){
        System.out.println("overridden method of parent class in child class");
    }
}
class Main{
     Main(){

    }
    public static void main(String[] args) {
//        Rough  r=new Rough();
//        r.hello();
//        child.hello();


        Rough r1=new child();
        r1.hello();     //it will still call the parent class method
                        // static methods are resolved at compile time based on the reference type.
                        // Static methods in Java do not participate in method overriding and polymorphism.

        int arr[]={10,20,30,40,50};
        for (int i:arr) {
            if(i==20||i==30){
                continue;
            }
            System.out.println(i);
        }
    }
}