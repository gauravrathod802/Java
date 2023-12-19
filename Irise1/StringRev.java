package Irise1;

public class StringRev extends RuntimeException{
    StringRev(String s){
        super(s);
    }

//    public static void main(String[] args) {
////        String a="Gaurav Rathod";
////        String rev="";
////
////        for (int i = a.length()-1; i >=0; i--) {
////            rev=rev+a.charAt(i);
////        }
////        if(a.equals(rev)){
////            System.out.println("palindrome");
////        }
////        else {
////            System.out.println("NOt Palindrome");
////        }
//////        System.out.println(rev);
//
//
//    }
}
class Test{
    static void hello() throws StringRev{
        int age=20;
        if(age>18){
            throw new StringRev("USerDefined Exception");
        }
    }
    public static void main(String[] args)  {
        try {
            hello();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String s1=new String("gaurav");
        String s2=new String("gaurav");
        String s3=new String("gaurav");
        String s4=new String("gaurav");
        String s5=new String("gaurav");
        String s="gaurav";
        //failed pass and failed safe
        //list iterator and iterator
        //diff new keyword and new instance method
        // singleton class
        //diff classpath and path
        //what is instanceOf method

    }
}