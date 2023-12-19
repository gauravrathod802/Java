package InterviewCodes.String;

class StringReverse {
    public static void main(String[] args) {
        String s = "Gaurav";
        String rev="";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev+=s.charAt(i);  //v i=5 i--        a i=4 i--
           
        }
        System.out.println(rev);



        // Java program to Reverse a String by
// converting string to characters one
// by one


//        class ReverseString {
//            public static void main(String[] args)
//            {
//                String input = "GeeksForGeeks";
//
//                // convert String to character array
//                // by using toCharArray
//                char[] try1 = input.toCharArray();
//
//                for (int i = try1.length - 1; i >= 0; i--)
//                    System.out.print(try1[i]);
//            }
//        }
//
//
  }
}