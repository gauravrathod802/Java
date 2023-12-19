package Pattern;
//12345
//678910
//1112131415
//1617181920
public class Number4 {
    public static void main(String[] args) {
        printNumberPattern();
        squarePattern();
    }
    static void printNumberPattern(){
        int count=1;
        for (int row = 1; row <=4; row++) {
            for (int col = 1; col <=5 ; col++) {
                System.out.print(count+" ");
                count++;      //(row-1)*5+col
            }

            System.out.println();
        }
    }
    static void squarePattern(){
        for (int row = 1; row <=6; row++) {
            for (int col = 1; col <=5; col++) {
                System.out.print(col*col+" ");
            }
            System.out.println();
        }
    }
}
