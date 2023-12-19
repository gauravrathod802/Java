package BitwiseOperator;

public class IsOdd {
    public static void main(String[] args) {
        int n=10;
        System.out.println(evenOdd(n));
    }
    static boolean isOdd( int n){
        return (n&1)==1 ;
    }
    static int evenOdd(int n){
        if((n&1)==0){
            System.out.print("Even: ");
        }
        else {
            System.out.print("Odd: ");
        }
        return n;
    }
}

//   1011
// & 0001
// -------
//   000|1|
// while performing bitwise AND operation we are using the least significant bit(LSB) if the LSB is 1 then the number is odd and if the LSB is 0 number is even