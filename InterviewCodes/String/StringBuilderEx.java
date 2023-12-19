package InterviewCodes.String;

import java.util.Arrays;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch=(char) ('a'+i);
            sb.append(ch);  // string builder will not create new object like String, but it will modify the that object only
        }
        System.out.println(sb);

        String s="GAURAV";

        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(s.toLowerCase());
        System.out.println(s);
        s="vikas";
        System.out.println(s);



        String arr="hello hi welcome bye";
        System.out.println(Arrays.toString(arr.split(" ")));
        String arr1[]=arr.split(" ");    // this will split the string using a space
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println(arr1);

    }
}
