package WrapperClass;

public class LowercaseUppercase {
    public static void main(String[] args) {
        String s="Welcome To Java";
        String s1="";


        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(Character.isUpperCase(c)){
                s1=s1+" "+Character.toLowerCase(c);
            }else if(Character.isLowerCase(c))
                s1=s1+Character.toUpperCase(c);
        }

        System.out.println(s1);
    }
}


class LowercaseUppercase1 {
    public static void main(String[] args) {
        String s="Welcome To Java";
        String s1[]=s.split(" ");
        String s2="";

        for (int i = 0; i < s1.length; i++) {
            String word=s1[i];
            for (int j = 0; j < word.length(); j++) {
                char c=word.charAt(j);
                if(Character.isUpperCase(c)){
                    s2=s2+" "+Character.toLowerCase(c);
                }else if(Character.isLowerCase(c))
                    s2=s2+Character.toUpperCase(c);
            }
            }


        System.out.println(s2);
    }
}
