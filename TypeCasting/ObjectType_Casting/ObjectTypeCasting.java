package TypeCasting.ObjectType_Casting;

// object type casting: 1.Upcasting: child class object is type cast to parent class object
//                      2.DownCasting:

public class ObjectTypeCasting {
        int x=10;
    }
    class child extends ObjectTypeCasting{
        public static void main(String[] args) {
            ObjectTypeCasting parent=new child();  //upcasting

//      child c= (child) new ObjectTypeCasting(); not allowed

            child c=(child) parent;              // downCasting
            System.out.println(c.x);
        }
}
