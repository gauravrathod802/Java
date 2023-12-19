package Pattern;

public class Rectangle {
    public static void main(String[] args) {
        rectanglePattern();
    }
    static void rectanglePattern(){
        for(int row=0;row<4;row++){
            for (int col = 0; col < 9; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
