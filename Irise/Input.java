package Irise;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {

        //taking input using bufferedReader class
        // Creating BufferedReader Object
        // InputStreamReader converts bytes to
        // stream of character
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number:");

        // Integer reading internally
        int i=Integer.parseInt(br.readLine());
        System.out.println(i);

        //taking input using scanner class
        Scanner sc=new Scanner(System.in);
        int j=sc.nextInt();
        System.out.println(j);
    }
}
