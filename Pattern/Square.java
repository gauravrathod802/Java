package Pattern;
//        * * * *
//        * * * *
//        * * * *
//        * * * *

public class Square {
    public static void main(String[] args) {
        squarePattern();
    }
    static void squarePattern(){
        for (int row=0;row<4;row++){
            for(int col=0;col<4;col=col+1){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
