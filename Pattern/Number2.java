package Pattern;
//1111
//2222
//3333
//4444
public class Number2 {
    public static void main(String[] args) {
        number();
    }
    static void number(){
        for (int row = 1; row < 5; row++) {
            for (int col = 1; col < 5; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
