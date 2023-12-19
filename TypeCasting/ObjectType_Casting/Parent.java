package TypeCasting.ObjectType_Casting;

public class Parent {
    public void m1(){
        System.out.println("parent m1");
    }
    public void m3(){
        System.out.println("parent m3");
    }
}

class Child extends Parent{
    public void m1(){
        System.out.println("child m1");
    }
    public void m2(){
        System.out.println("child m2");
    }

    public static void main(String[] args) {
        Parent parent=new Child();
        parent.m1();
        parent.m3();

        Child ch=new Child();
        ch.m3();
        // child can call any method of parent class but parent cannot call every method of child it can call only the overridden methods of
        // parent class only parent cannot call child specific methods.
    }
}