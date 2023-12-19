package InterviewCodes.String;

class LengthOfString {
    //length of string without using foreach and length
    public static void main(String[] args) {
        String str = "community Brands";
        System.out.println(lengthStr(str));
    }

    static int lengthStr(String str) {
        int count = 0;
        int index = 0;

        while (true) {
            try {
                char ch = str.charAt(index);
                count++;
                index++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }
}