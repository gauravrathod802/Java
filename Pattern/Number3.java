package Pattern;
//        444444
//        444444
//        444444
//        444444
//        444444

public class Number3 {
    public static void main(String[] args) {
        pattern4();
    }
    static void pattern4(){
        for (int row = 1; row < 6; row++) {
            for (int col = 1; col <7 ; col++) {
                System.out.print("4 ");
            }
            System.out.println();
        }
    }
}
