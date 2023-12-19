package Static__;

public class InnerStaticClass{
//    if you create normal class it will give error in main method
    static class Test{
        String name;
        Test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Test t=new Test("gaurav");
        Test t2=new Test("vaibhav");
        System.out.println(t.name);
        System.out.println(t2.name);
    }
}
