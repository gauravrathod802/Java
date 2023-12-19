package TreakyQuestions;

public class PrintNumbers {
    public static void main(String[] args) {
        String s="a3cf23g";
        String reg=s.replaceAll("[a-zA-Z]","");
        System.out.println(reg);
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch>='a' && ch<= 'z'){
            }
            else {
                System.out.print(ch);
            }

        }

    }
}
