package Pattern;
//        FGHIJK
//        FGHIJK
//        FGHIJK
//        FGHIJK
//        FGHIJK
public class FtoKCharPattern {
    public static void main(String[] args) {
        pattern();
        char name='S'+1;
        System.out.println(name);
        pattern2();
        pattern3();
    }
    static void pattern(){
        for (int row = 1; row < 6; row++) {
            for (int col = 1; col < 7; col++) {
                char c= (char) ('F'+col-1);

                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    static void pattern2(){
        for (int row = 1; row <= 5; row++) {
            char name=(char)('a'+row-1);                            //row-1 is just taken for printing that same element a+1-1=a
            for (int col = 0; col <=5 ; col++) {
                System.out.print(name+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(){
        for (int row = 0; row < 5; row++) {
            for (char col = 'a'; col < 'e'; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
