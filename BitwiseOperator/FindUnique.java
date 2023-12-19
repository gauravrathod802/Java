package BitwiseOperator;

public class FindUnique {
    public static void main(String[] args) {
        int arr[]={2,4,5,5,3,1,3,1,2};
        int u=findUnique(arr);
        System.out.println(u);
    }
    public static int findUnique(int[] arr) {
        int unique=0;
        for (int n: arr) {
            unique^=n;
        }
    return unique;
    }
}
//this code will work for single unique only