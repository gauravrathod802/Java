package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;

//comparable is default sorting

public class StudentAgeSortingUsingCollection {
    public static void main(String[] args) {
        ArrayList<Students> studentsArrayList=new ArrayList<>();
        Students s1=new Students(1002,"viraj",19);
        Students s2=new Students(1005,"gaurav",23);
        Students s3=new Students(1001,"dinesh",17);
        Students s4=new Students(1007,"vikas",15);
        Students s5=new Students();
        s5.setSid(1006);
        s5.setName("tushar");
        s5.setAge(20);

        studentsArrayList.add(s1);
        studentsArrayList.add(s2);
        studentsArrayList.add(s3);
        studentsArrayList.add(s4);
        studentsArrayList.add(s5);
        System.out.println(studentsArrayList);
        System.out.println("----------------after sorting----------------");

        Collections.sort(studentsArrayList);
//        for (Students stu:studentsArrayList) {
//            System.out.println(stu);
//        }
        int i=0;
        while(i<studentsArrayList.size()){
            System.out.println(studentsArrayList.get(i));
            i++;
        }

    }
}
class Students implements Comparable<Students>{
    private int sid;
    private String name;
    private int age;

    public Students() {
        super();
    }

    public Students(int sid, String name, int age) {
        super();
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Students students) {
        if(this.age>students.getAge()){
            return 1;
        }else{
            return -1;
        }

//        return this.getName().compareTo(students.getName());
    }
}
