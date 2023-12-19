package CollectionFramework.Comparator;

import java.util.Comparator;

public class SortEnameByComparator implements Comparator<Employee> {
    public int compare(Employee e1,Employee e2){
        return e1.getEname().compareTo(e2.getEname());
    }
}
