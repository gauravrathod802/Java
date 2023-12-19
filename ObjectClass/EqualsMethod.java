package ObjectClass;
import java.util.Objects;

public class EqualsMethod {
    int rollNo;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsMethod that = (EqualsMethod) o;
        return rollNo == that.rollNo && name.equals(that.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }
//    public boolean equals(EqualsMethod equals){
////        if(this.rollNo==equals.rollNo && this.name.equals(equals.name)){
////            return true;
////        }
////        else {
////            return false;
////        }
//        return this.rollNo==equals.rollNo && this.name.equals(equals.name);
//    }

    public static void main(String[] args) {
        EqualsMethod obj1=new EqualsMethod();
        obj1.rollNo=1;
        obj1.name="gaurav";
        EqualsMethod obj2=new EqualsMethod();
        obj2.rollNo=1;
        obj2.name="gaurav";

        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1.hashCode()==obj2.hashCode());

    }
}
