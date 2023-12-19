package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList=new ArrayList<>();
        Employee emp1=new Employee(101,"gaurav",50000);
        Employee emp2=new Employee(104,"Akshay",60000);
        Employee emp3=new Employee(102,"vikas",20000);
        arrayList.add(emp1);
        arrayList.add(emp2);
        arrayList.add(emp3);


        System.out.println(arrayList);
        System.out.println("After Sorting");
        Collections.sort(arrayList,new SortEmpIdByComparator());
        System.out.println(arrayList);
        System.out.println("After Sorting by names");
        Collections.sort(arrayList,new SortEnameByComparator());
        System.out.println(arrayList);

//        int i=0;
//        while(i<arrayList.size()){
//            System.out.println(arrayList.get(i));
//            i++;
//        }
    }


}
