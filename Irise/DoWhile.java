package Irise;

public class DoWhile {
    public static void main(String[] args) {
        int a=1;
        // Even number between, 1 to 30
        do{
            if(a%2==0){
                System.out.println(a);
            }
            a++;
        }while(a<=30);
    }
}
