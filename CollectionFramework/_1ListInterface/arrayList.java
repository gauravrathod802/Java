package CollectionFramework._1ListInterface;

import java.util.*;

public class arrayList {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Object [] arr1={"Gaurav",23,'i'};
        System.out.println(Arrays.toString(arr1));
        int arr2[]={1,2,3,'a'};
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i <= 5; i++) {
            arr.add(i);
        }
        System.out.println(arr);

        arr.remove(0);
        System.out.println(arr);

        Iterator<Integer> itr=arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
