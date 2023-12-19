package CollectionFramework.HashMap;

import java.util.*;

public class hashMapEx {
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap<>();
        hm.put(1,"hi");
        hm.put(2,"hello");
        hm.put(3,"gaurav");

        //Map interface, you can get an iterator over the key-value mappings using the entrySet() method, which returns a Set of Map.Entry objects.

        Iterator<Map.Entry<Integer,String>> itr=hm.entrySet().iterator(); //Map.Entry is an interface that represent key value mapping in map
        while(itr.hasNext()){
            Map.Entry<Integer,String> m=itr.next();
            Integer key=m.getKey();
            String value=m.getValue();
            System.out.println(key+":"+value);
        }


    
    }
}
