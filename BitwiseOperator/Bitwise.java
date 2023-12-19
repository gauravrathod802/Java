package BitwiseOperator;

import java.util.Arrays;

public class Bitwise {
    public static void main(String[] args) {
        int a=10;
        int b=a<<1;     // left shift
        int c=a>>1;
        System.out.println("Left shift:"+b+" \nRight shift:"+c);
        int oldCapacity=10;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        System.out.println(newCapacity);

        Object heterogeneous[]={10,"hello",'h'};
        System.out.println(Arrays.toString(heterogeneous));
    }
}
