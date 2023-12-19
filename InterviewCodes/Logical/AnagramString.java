package InterviewCodes.Logical;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1="Brag1";
        String s2="G1rab";
        System.out.println(isAnagram(s1,s2));
    }
    static boolean isAnagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char [] string1=str1.toCharArray();
            char [] string2=str2.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);
            if(Arrays.equals(string1,string2)==true){
                return true;
            }else {
                return false;
            }

        }else{
            return false;
        }
    }
}
