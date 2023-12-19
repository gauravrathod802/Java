package Irise;

public class VariableEx {
     int j=15;                  // instance variable
     static String s="Gaurav";     //static variable


    void localVariableMethod(){
        int i=10;               //local variable
        System.out.println(i);
//        System.out.println(j);  it is allowed

    }
    public static void main(String[] args) {
      //  System.out.println(j);   It will give error because we cannot access instance
                                //  variable directly we have to create object of class
        VariableEx v=new VariableEx();
        v.localVariableMethod();
        System.out.println(v.j);
        System.out.println(s);

    }

}
