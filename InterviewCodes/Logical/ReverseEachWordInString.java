package InterviewCodes.Logical;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str="Hello my name is Gaurav";
        String arr[]=str.split(" ");
        String revStr="";
        for (int i = 0; i < arr.length; i++) {
            String word=arr[i];
            String revWord="";
            for (int j = word.length()-1; j >=0 ; j--) {
                revWord=revWord+word.charAt(j);
            }
            revStr=revStr+revWord+" ";
        }
       System.out.println(revStr);
    }
}
