package TreakyQuestions;

public class SwapUsingMethod {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}

//        It initializes two variables, a and b, with the values 10 and 20, respectively.
//        Calls the swap method with the values of a and b.
//        Prints the values of a and b after the swap method call.
//        However, this will not print swapped values because Java passes parameters by value.

//        Declares a swap method that takes two parameters, a and b.
//        Creates a temporary variable temp and assigns the value of a to it.
//        Assigns the value of b to a.
//        Assigns the value of temp (which is the original value of a) to b.
//        The issue with this code is that the changes made to a and b inside the swap method are local to that method.
//        When you pass primitive data types (like int) to a method in Java, a copy of the value is passed. Therefore,
//        modifying the parameters inside the method does not affect the original values in the main method.
//
//        To achieve the desired result, you should pass the variables by reference, which can be done using objects or an array.
//        Alternatively, you can return the swapped values from the swap method. Here's an example using an array:

//public class SwapUsingMethod {
//    public static void main(String[] args) {
//        int[] values = {10, 20};
//        swap(values);
//        System.out.println(values[0] + " " + values[1]);
//    }
//
//    static void swap(int[] arr) {
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//    }
//}
