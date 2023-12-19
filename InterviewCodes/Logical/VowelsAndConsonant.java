package InterviewCodes.Logical;
import java.util.Scanner;

public class VowelsAndConsonant {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine().toLowerCase(); // Convert the input to lowercase for case-insensitive comparison
            scanner.close();

            int vowels = 0;
            int consonants = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }


