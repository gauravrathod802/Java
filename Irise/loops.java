package Irise;

public class loops {
    public static void main(String[] args) {
        System.out.println("for loop");
        for (int i=0;i<10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("while loop");
        int j=0;
        while(j<10){
            System.out.print(j+" ");
            j++;
        }

        int p=10;
        System.out.println();
        System.out.println("do-while");
        do{
            System.out.println("hello");
        }while(p<10);


    }
}
