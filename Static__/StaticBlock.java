package Static__;

import TreakyQuestions.StaticDemo;

public class StaticBlock {
    static int a=10;
    static int b;

    //static block run only once when the object is created
    static {
        System.out.println("I am a static block!");
        b=a*4;
    }
    public static void main(String[] args) {
        StaticBlock sb=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b=b+3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
