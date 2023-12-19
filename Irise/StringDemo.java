package Irise;

public class StringDemo {
    public static void main(String[] args) {
        String s=new String("HeLLo");
        String s1="hello";
        String lower=s.toLowerCase();
        System.out.println(lower);
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.concat(s1));
        System.out.println(s.substring(2));
        System.out.println(s.substring(3,4));
        System.out.println(s.contains("L"));
        System.out.println(s.isEmpty());
        System.out.println(s.replace('L','l'));
        System.out.println(s.indexOf('L'));
        System.out.println(s.indexOf('L',3));
        String s2="    WelCome   ";
        System.out.println(s2.length());
        System.out.println(s2.trim().length());
    }
}
