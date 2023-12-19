package CollectionFramework.Comparator;

import java.util.Comparator;

// comparator is customised sorting
public class SortEmpIdByComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
//        return o1.getSalary() - o2.getSalary();
        return o1.getEmpId()-o2.getEmpId();
    }
}
