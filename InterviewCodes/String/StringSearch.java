package InterviewCodes.String;

public class StringSearch {
    public static void main(String[] args) {
        String s="Gaurav";
        char target='a';
        System.out.println(search(s,target));

        StringBuilder s1= new StringBuilder("hello");
        s1.reverse();

    }
    static boolean search(String s,char target){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==target){
                return true;

            }

        }
        return false;

    }
}
