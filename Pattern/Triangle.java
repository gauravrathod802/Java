package Pattern;
//*
//**
//***
//****
//*****
//1
//12
//123
//1234
//12345
//1
//21
//321
//4321
//54321
//1
//22
//333
//4444
//55555
//a
//bb
//ccc
//dddd
//eeeee
//12345
//1234
//123
//12
//1
//*****
//****
//***
//**
//*
public class Triangle {
    public static void main(String[] args) {
//        trianglePattern();
//        pattern2();
//        pattern3();
//        pattern4();
//        pattern5();
//        pattern6();
//        pattern7();
//        pattern8();
//        patternUsingWhile();
//        patternUsingDoWhile();
//        forEachLoopPattern();
//        spacePattern();
//        spacePattern2(7);
//        spacePattern3(5);
//        spacePatternChar(6);
        simpleTriangle(5);

    }
     static void trianglePattern(){
         for (int row = 1; row <=5; row++) {
             for (int col = 1; col <=row ; col++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
    static void pattern2(){
        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(){
        for (int row = 1; row <=5; row++) {
            for (int col = row; col>=1; col=col-1) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern4(){
        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(){
//        for (char row ='a'; row <='e' ; row++) {
//            for (char col = 'a'; col <=row ; col++) {
//                System.out.print(row);
//            }
//            System.out.println();
//        }
        for (int row = 1; row <=5; row++) {
            char c=(char)('a'+row-1);
            for (int col = 1; col <=row; col++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    static void pattern6(){
        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <= 5-(row-1); col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern7(){
        for (int row = 5; row>=1 ; row=row-1) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern8(){
        for (int row = 0; row<=4 ; row++) {
            for (int col = 0; col <=4-row ; col++) {
                System.out.print("5 ");
            }
            System.out.println();
        }
    }
    static void patternUsingWhile(){
        int row=1;
        while (row<=5){
            int col=1;
            while (col<=5-(row-1)){
                System.out.print("8 ");
                col++;
            }
            System.out.println();
            row=row+1;
        }

    }
    static void patternUsingDoWhile(){
        int row=1;
        do{
            int col=1;
            do{
                System.out.print("1 ");
                col++;
            }while(col<=5-(row-1));
            System.out.println();
            row++;

        }while(row<=5);
    }
    static void forEachLoopPattern(){
        char arr[][]={
                {'*','*','*','*','*'},
                {'*','*','*','*'},
                {'*','*','*'},
                {'*','*'},
                {'*'},
                {'*','*'},
                {'*','*','*'},
                {'*','*','*','*'},
                {'*','*','*','*','*'},
        };
        String[][] arr1={
                {"     *"},
                {"   *   *"},
                {"  * * * *"},
                {" *       *"},
                {"*         *"}

        };
        for (String[] str:arr1) {
            for (String s: str) {
                System.out.print(s);
            }
            System.out.println();
        }

        for (char[] row:arr) {
            for (char col:row) {
                System.out.print(col+" ");

            }
            System.out.println();


        }
    }
    static void spacePattern(){
        for (int row = 1; row <=5; row++) {
            for (int space = 1; space <=5-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void spacePattern2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int space = 1; space <=n-row ; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print(row+" ");
            }
            System.out.println();

        }
    }
    static void spacePattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int space = 1; space <=n-row ; space++) {
                System.out.print("  ");
            }
            for (int col = row; col>=1 ; col--) {
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }
    static void spacePatternChar(int n){
        for (int row = 1; row <=n ; row++) {
            for (int space = 1; space <=n-row ; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=row ; col++) {
//                for (char col = 'a'; col <='a'+row-1 ; col++) {sout(col+" ")}
                char c=(char)('a'+col-1);

                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    static void simpleTriangle(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.println(col);
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
