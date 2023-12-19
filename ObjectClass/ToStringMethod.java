package ObjectClass;

public class ToStringMethod {
//    here we are overriding the toString method of object class, and we are returning our message
//    this method is returned in object class, and it gives class name and hashcode

    int marks;
    String name;
    public String toString(){
//        return getClass().getName();
        return marks +" "+name;
    }
    public static void main(String[] args) {
        ToStringMethod ts=new ToStringMethod();
        ts.marks=90;
        ts.name="gaurav";
        System.out.println(ts);
    }
}
