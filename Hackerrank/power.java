package Hackerrank;

import java.util.*;
import java.lang.Math;

class power{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
    /*    for(int i=0;i<t;i++)
   {

        try
        {
            long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if(x>=-128 && x<=127)
            System.out.println("* byte");
            if(x>=-32768 && x<=32767)
            System.out.println("* short");
            if(x>=-2147483648 && x<=2147483647)
            System.out.println("* int");
            if(x>=-9223372036854775808L && x<=9223372036854775807L)
            System.out.println("* long");
        }
        catch(Exception e)
        {
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }

    }
}
}*/
      for (int i = 0; i <= t; i++) {
            try {
                long n = sc.nextLong();
                System.out.println(n + " can be fitted in:");
                if (n<= Math.pow(2, 7)  && n >= Math.pow(-2, 7) + 1) {
                    System.out.println("*byte");
                } if (n<= Math.pow(2, 15) - 1  && n >= Math.pow(-2, 15)) {
                    System.out.println("*short");
                } if (n<= Math.pow(2, 31) - 1 && n >= Math.pow(-2, 31)) {
                    System.out.println("*int");
                } if (n<= Math.pow(2, 63) - 1  && n >= Math.pow(-2, 63)) {
                    System.out.println("*long");
                }
            }catch(Exception e)
            {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
