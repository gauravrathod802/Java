package InterviewCodes.String;

import java.util.Arrays;

public class CharacterOccuranceInString {
    public static void main(String[] args) {
        String s="welcomec";
        int count;
        int []arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            arr[i]= count;
        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) {
//            if(arr[i]>1)
                System.out.println(arr[i]+" "+ s.charAt(i));
        }
    }
}






//
//for (int i = arr.length-1; i >=0 ; i--) {
//        char max=0;
//        if(arr[i]>1){
//                if(arr[i]>max){
//                    max=s.charAt(i);
//                }
//        System.out.println(arr[i]+" "+ s.charAt(i));
//
//        }
//
//            System.out.println(arr[i]+" "+s.charAt(i));
//        }


class UniqueCharacterOccurrenceInString {
    public static void main(String[] args) {
        String s = "WELCOMEC";
        int[] counts = new int[150]; // Assuming ASCII characters

        // Count the occurrences of each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            counts[ch]++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if the character has not been printed yet (count is not zero)
            if (counts[ch] > 0) {
                System.out.println(ch + " " + counts[ch]);
                counts[ch] = 0; // Mark this character as printed
            }
        }
    }
}
class CharacterOccurrenceInString1 {
    public static void main(String[] args) {
        String s = "welcomec";
        int count;
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            count = 1;

            // Check if this character is a repeating character
            boolean isRepeating = false;

            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }

            if (isRepeating) {
                continue; // Skip repeating characters
            }

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            arr[i] = count;
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                System.out.println(arr[i] + " " + s.charAt(i));
            }
        }
    }
}








 class CharacterOccurance {
    public static void main(String[] args) {
        String s = "welcomeccw";
        int count;
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            count = 1;

            if (arr[i] != 0) {
                continue; // Skip characters that have already been counted
            }

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    arr[j] = -1; // Mark the character as counted
                }
            }

            if (count > 1) {
                arr[i] = count;
                System.out.println(count + " " + s.charAt(i));
            }
        }
    }
}
