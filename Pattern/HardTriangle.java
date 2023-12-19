package Pattern;
//    *
//   ***
//  *****
// *******
//*********
//    1                  1
//   121                 2
//  12321                3
// 1234321               4
//123454321              5

public class HardTriangle {
    public static void main(String[] args) {
//        isoscelesTriangle(6);
//        triangleReverseNumber(5);
//        pyramid(5);
        pyramid(5);
    }
    static void isoscelesTriangle(int n){
        for (int row = 1; row<=n ; row++) {
            for (int space = 1; space <=n-row ; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=2*row-1 ; col++) {
                char c=(char) ('a'+col-1);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    static void triangleReverseNumber(int n){
        for (int row = 1; row <=n; row++) {
            for (int space = 1; space <=n-row ; space++) {
                System.out.print("  ");
            }
            for (int inc = 1; inc <=row ; inc++) {
                System.out.print(inc+" ");
            }
            for (int dec = row-1; dec>=1 ; dec--) {
                System.out.print(dec+" ");
            }
            System.out.println();
        }
    }
    static void pyramid(int n){
        for (int row = 1; row <=n ; row++) {
            for (int space = 1; space <=n-row ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int row = n-1; row >=1 ; row--) {
            for (int space = 1; space <=n-row ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void butterfly(int n){
        for (int row = 1; row <=n ; row++) {

            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <=2*n-2*row ; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = n-1; row >=1 ; row--) {

            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <=2*n-2*row ; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
