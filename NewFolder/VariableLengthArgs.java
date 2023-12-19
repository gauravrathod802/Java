package NewFolder;

import java.util.Arrays;

public class VariableLengthArgs {
    public static void main(String[] args) {
        varArgs(3,4,56,7,8,9,87,65,5,75);
    }

    static void varArgs(int ...v){
        System.out.println(Arrays.toString(v));
    }

//    static void h1(int a){
//        System.out.println("hello");
//    }                                                  not accepted because of parameter list
//    static int h1(int b){
//        System.out.println("hello");
//        int h1=10;
//        return h1;
//    }

}
