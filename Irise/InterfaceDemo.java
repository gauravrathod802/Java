package Irise;

abstract class AbstractDemo{
  abstract void display();
    void hello(){
        System.out.println("hello");
    }

}
class Demo extends AbstractDemo{
    public static void main(String[] args) {
        Demo d=new Demo();
        d.display();
        d.hello();
    }
    void display() {
        System.out.println("display something");
    }
}


interface MyInterface{
     public static final int x=10;
     void display();
}
class hello implements MyInterface{
    private int x=10;

    public int getX(int x){
        return x;
    }
    public void setX(){
        System.out.println(x);
    }
    @Override
    public void display() {
        System.out.println("Display method of interface");
    }
}
class hello1 extends hello{
    public static void main(String[] args) {
        hello h=new hello();
        h.setX();
        h.display();
    }

}



abstract class Shape{
    public void draw(){
        System.out.println("Draw something");
    }
}
class Test1 extends Shape{
    public static void main(String[] args) {
        Shape s=new Shape() {
            @Override
            public void draw() {
                super.draw();
            }
        };
        s.draw();
    }
}