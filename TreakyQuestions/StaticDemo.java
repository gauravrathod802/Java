package TreakyQuestions;

public class StaticDemo {
    int a;
    int b;
    static void demo(int b){
//        this.b=b;  //non static cannot be referenced from static context
    }
    StaticDemo(int a){
        this.a=a;
    }
    public static void main(String[] args) {
        StaticDemo sd=new StaticDemo(10);
        System.out.println(sd.a);
        StaticDemo.demo(20);
        System.out.println(sd.b);
    }
}
