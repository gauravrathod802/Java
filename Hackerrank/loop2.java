package Hackerrank;

import java.io.*;
import java.util.*;

public class loop2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
               int a=sc.nextInt();
               int b=sc.nextInt();
               int n=sc.nextInt();
            for(int j=1;j<=n;j++){
                System.out.print((a + b)+" ");
                a=a+b;
                b=b*2;
            }
            System.out.println();

        }

            sc.close();
        }
        
    }
