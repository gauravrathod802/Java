package Irise;

class arrayDemo1 {
//    public static void main(String[] args) {
////        int arr[]={2,3,4,5,6,6,7};
////        for (int i = 2; i <arr.length ;i=i+2) {
////            System.out.println(arr[i]);
//
//        }
public int property=10;
    void hello(){
            System.out.println("hello");
            System.out.println("parent");
        }
//        public static void main(String[] args) {
//            System.out.println("Hello, World!");
//
//        }
    }

public class arrayDemo extends arrayDemo1{
    public int property;
        void hello2(){
//            i=10;
//            System.out.println(i);
            System.out.println("child hello");
        }
        void hello1(){
//            i=10;
//            System.out.println(i);
            System.out.println("child hello");
        }
        public static void main(String arg[]){
            arrayDemo1 h1=new arrayDemo();
            h1.hello();


        }
    }


