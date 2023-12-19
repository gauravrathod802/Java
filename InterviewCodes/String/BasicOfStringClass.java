package InterviewCodes.String;

public class BasicOfStringClass {
    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            System.out.println(ch);
        }

        String s="";
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            s=s+ch;                             //this will every time create new object of string a ab abc abcd abcde every time new object is created
        }
        System.out.println(s);
        System.out.println("a"+'b');
    }
}
