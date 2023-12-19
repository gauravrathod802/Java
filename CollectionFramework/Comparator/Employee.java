package CollectionFramework.Comparator;

public class Employee {
    private int EmpId;
    private String Ename;
    private int salary;

    public Employee(){
        super();
    }
    public Employee(int EmpId,String Ename,int salary){
        super();
        this.EmpId=EmpId;
        this.Ename=Ename;
        this.salary=salary;
    }

    public int getEmpId(){
        return EmpId;
    }
    public void setEmpId(int EmpId){
        this.EmpId=EmpId;
    }
    public String getEname(){
        return Ename;
    }
    public void setEname(){
        this.Ename=Ename;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary=salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + EmpId +
                ", Name='" + Ename + '\'' +
                ", Salary=" + salary +
                '}';
    }
}
