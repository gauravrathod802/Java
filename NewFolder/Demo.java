package NewFolder;

public class Demo {
     int i=10;

    public int call(){
        Demo d=new Demo();
        System.out.println(d.i);
       return d.i=101;
    }
    public static void main(String[] args) {
        String s="hello";
        System.out.println(s);
//        Demo d=new Demo();
//d.call();
    }
}
