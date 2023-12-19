package Pattern;

//1234
//1234
//1234
//1234
public class Numbers {
    public static void main(String[] args) {
        numberPattern();
    }
    static void numberPattern(){
        for (int row = 1; row < 5; row++) {
            for (int col = 1; col < 5; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
