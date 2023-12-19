package Irise;

public class MainOverloading {

        public static void main(String[] s) {
            System.out.println(s[0]);
            System.out.println(s[1]);
            System.out.println(s[2]);
            System.out.println("this is string");
            System.out.println("this is second line");
            int arr[]={10,20,30};
            main(arr);
            char[] c={'c','a','t'};
            main(c);

        }
        public static void main(int[] s) {
            System.out.println(s[0]);
            System.out.println(s[1]);
            System.out.println(s[2]);
            System.out.println("this is integer");


        }
        public static void main(char[] s) {
            System.out.println(s[0]);
            System.out.println(s[1]);
            System.out.println(s[2]);
            System.out.println("this is character");


        }

}
