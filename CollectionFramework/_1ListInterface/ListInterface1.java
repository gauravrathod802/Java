package CollectionFramework._1ListInterface;

import java.util.ArrayList;
import java.util.*;

//Removing duplicate using hashset
public class ListInterface1 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        Set set= new HashSet();
        names.add("vikas");
        names.add("vivek");
        names.add("gaurav");
        names.add("gaurav");
        names.add("akshay");
        names.add("vivek");
        names.add("gauri");
        System.out.println("List contains 7 names: "+names);
        for (String str:names) {
            // Added list elements to HashSet, and it will store only unique names
            set.add(str);
        }
        System.out.println("Unique names in set: "+set);

    }
}
