package InterviewCodes.String;

import java.util.Arrays;
import java.util.Locale;

public class DuplicateWordFromString {
    public static void main(String[] args) {
        String str="I know JAVA and know ADV java";
        String arr[]=str.split(" ");

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if (arr[i].equalsIgnoreCase(arr[j])){
                   System.out.println(arr[i]);
               }
            }
        }
    }
}
