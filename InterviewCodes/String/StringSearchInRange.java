package InterviewCodes.String;

public class StringSearchInRange {
    public static void main(String[] args) {
        String name="hello world!!";
        char target='l';
        System.out.println(searchInRange(name,target,4,9));
    }
    static int searchInRange(String name,char target,int start, int end){
        if(name.length()==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            char c=name.charAt(i);
            if(c==target){
                System.out.print("Character found at index: ");
                return i;
            }

        }
        return -1;
    }
}
