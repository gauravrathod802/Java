package CollectionFramework._3SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(70);
        hs.add(30);
        hs.add(10);
        Iterator<Integer> iterator= hs.iterator();
        while(iterator.hasNext()){
            int data= iterator.next();
            System.out.println(data);
        }
    }
}
