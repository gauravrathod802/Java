package Irise;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    static int x=1111;
    Questions(){
        super();
    }
    static
    {
        x=x-- - --x;
    }
    {
        x=x++ + ++x;
    }
    public static void main(String[] args) {
        int i;     // static cannot be written here
        for ( i = 0; i <=5; i++) {
        }
        System.out.println(i);
        System.out.println("hello"+20+30);
        System.out.println(20+30+"hello");
        System.out.println("hello"+10*20);
        System.out.println(10/20+"hello");
        System.out.println(25%20+"hello");
        System.out.println("hello"+10%20); //hello10

        String s="irise";
        String s1=new String("irise").intern();
        if(s==s1){
            System.out.println("equal");
        }else{
            System.out.println("unequal");
        }
//        sout{
//        int a;
//        System.out.println(a);}



        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(array);
        System.out.println(list);

        {
            System.out.println("helloworld");
        }
        System.out.println(x);
        Questions q=new Questions();
        System.out.println(q.x);




//      for( ; ; )
//      for( ; true; )
//
//      for( ; 2==2; )
//      for(int i=1; i>=1; i++)
    }

}

//class problem{
//    System.out.println("hello");
//}

class Person {
    public Person() {
        System.out.println("Person class constructor called");
    }
}
class Employee extends Person {
    int a;
//        System.out.println(a);
//    Employee(int a,int b){}
    public Employee() {

        //super();  if we don't use super it will implicitly call super()  and it should be written on first line only

//       new Employee();
        System.out.println("Employee class constructor called");
    }
//    void m1(){
//        int a;
//        System.out.println(a);
//    }
    public static void main (String args[]) {

        Employee e = new Employee();
        System.out.println(e.a);
    }
}


//
//class A{
//    void m1(){
//    int a;
//    System.out.println(a);
//    }
//}  generates error

//class Test
//{
//    int x, y;
//    Test(int a, int b)
//    {
//        x = a;
//        y = b;
//    }
//    public static void main (String args[])
//    {
//        Test test = new Test();
//        System.out.println(test.x+" "+test.y);
//    }
//}

//class Treaky{
//    public static void main(String[] args) {
//        int a='a'/'a';
//        String s="1234567890";
//        for (int i = a; i <= s.length(); i++) {
//            System.out.println(i);
//        }
//    }
//}

class program{
    public static void main(String[] args) {
        String s="HEllo";
        String s1=s.toLowerCase();
        System.out.println(s);
    }
}

class program1{
    static int a=40;
    static int b=20;
    static int c=30;

    static void m1()
    {
        int c=a-b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        System.out.println(c);
    }

}


class Example{
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((int) ('a'+4));
        System.out.printf("%.2f",Math.sqrt(2));
    }
}

class Animal {
    public Animal() {
        System.out.println("Animal constructor called.");
    }
}

class Cat extends Animal {
    public Cat() {
        super(); // calls the Animal constructor
        System.out.println("Cat constructor called.");
    }
}
