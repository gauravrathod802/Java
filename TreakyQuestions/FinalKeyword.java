package TreakyQuestions;

public class FinalKeyword {
    public static void main(String[] args) {
        final ABC a=new ABC("gaurav");   //final keyword is applied to the reference variable, so we cannot reassign new object to the reference variable a
        //a = new ABC(10);  // This line will result in a compilation error
        a.name="gaurav rathod";  // gc is called for this
        a.name="vikas";
        System.out.println(a.name);
    }
}
class ABC{
    String name;

    public ABC(String name) {
        this.name = name;
    }
}