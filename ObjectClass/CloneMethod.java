package ObjectClass;

public class CloneMethod implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException{
        CloneMethod c=new CloneMethod();
        CloneMethod c2= (CloneMethod) c.clone();   //clone method will create the exact copy of object, but it will store in different memory location

        System.out.println(c.hashCode()); // its address is different from clone object
        System.out.println(c2.hashCode());

    }
}
