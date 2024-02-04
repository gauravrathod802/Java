package Irise;

import java.util.Scanner;

public class ProductTask {
    static void create(){

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("********* Welcome to my application *********");

//        int n=sc.nextInt();
//        Test t[]=new Test[n];
//        for (int i = 0; i < t.length; i++) {
//            t[i]=new Test();
//            t[i].create();
//        }
//        Test t=new Test();
        while(true){
            System.out.println("1.Create Product\n2.Get Product\n3.Delete Product\n4.Update Product\n5.Close");
            System.out.print("Choose Option:");
            int task = sc.nextInt();
            int n= sc.nextInt();
            Test t1[]=new Test[n];
            switch (task){
                case 1:

                    for (int i = 0; i <t1.length ; i++) {
                        t1[i]=new Test();
                        t1[i].create();
                    }
                    break;
                case 2:

                    for (int i = 0; i < t1.length; i++) {
                        t1[i].show();
                    }
//                    t.show();
                    break;
                case 3:
                    System.out.print("Enter PID to delete product:");
//                    PID=sc.next();
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Thank you");
                    System.exit(0);

            }
        }
    }
}
class Test{
    private int PID;
    private String  PName;
    private int Price;

    public void setPID(int PID) {
        this.PID = PID;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public void setPrice(int price) {
        this.Price = price;
    }


    public int getPID() {
        return PID;
    }

    public String getPName() {
        return PName;
    }

    public int getPrice() {
        return Price;
    }

     void create(){
        Scanner ss=new Scanner(System.in);
        System.out.print("Enter PID:");
        setPID(ss.nextInt());
        System.out.print("Enter Product Name:");
        setPName(ss.next());
        System.out.print("Enter Product Price:");
        setPrice(ss.nextInt());
    }
    void show(){
        System.out.println("PID: "+getPID());
        System.out.println("Product Name: "+getPName());
        System.out.println("Product Price: "+getPrice());
    }
}
