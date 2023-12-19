package CollectionFramework._1ListInterface;
import java.util.Enumeration;
import java.util.Vector;

//vector is a legacy class introduced in java 1.0
public class vectorEx {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();

        v.add(10);

        v.add(11);v.add(12);v.add(13);v.add(14);
        System.out.println(v);
        v.remove(2);

//        System.out.println(v);
        //Enumeration interface contains only two methods hasMoreElements() and nextElement().It is only used for Legacy classes
        Enumeration<Integer> e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
