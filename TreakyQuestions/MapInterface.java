package TreakyQuestions;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<List, Set> m=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        Set<String> s=new HashSet<>();
        s.add("Gaurav");
        s.add("Vikas");
        m.put(l,s);

        Iterator<Map.Entry<List, Set>> iterator = m.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<List, Set> entry = iterator.next();
            List<Integer> key = entry.getKey();
            Set<String> value = entry.getValue();

            System.out.println("Key: " + key);
            System.out.println("Value: " + value);}

    }
}
