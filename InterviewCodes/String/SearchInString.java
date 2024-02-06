package InterviewCodes.String;

public class SearchInString {
    public static void main(String[] args) {
        String name="gaurav";
        char c='a';
        System.out.println(search2(name,c));
    }
    static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }
        for(char c:name.toCharArray()){
            if(c==target){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String name, char target){
        if(name.length()==0){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if(target==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
