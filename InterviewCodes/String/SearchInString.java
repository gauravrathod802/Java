package InterviewCodes.String;

public class SearchInString {
    public static void main(String[] args) {
        String name="gaurav";
        char c='z';
        System.out.println(search(name,c));
    }
    static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }
        for(char c:name.toCharArray()){
//            char t=c;
//            System.out.println(c);
            if(c==target){
                return true;
            }
        }
        return false;
    }
}
