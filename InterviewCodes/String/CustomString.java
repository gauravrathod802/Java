package InterviewCodes.String;


    public class CustomString {
        private String text;

        public CustomString(String text) {
            this.text = text;
        }

        public char chatAt(int index) {
//            if (index < 0 || index >= text.length()) {
//                throw new IndexOutOfBoundsException("Index is out of bounds");
//            }
            return text.charAt(index);
        }

        public int length() {
            return text.length();
        }

        public static void main(String[] args) {
            CustomString customString = new CustomString("Hello");

            // Access characters using the chatAt method
            char character = customString.chatAt(1);
            System.out.println("Character at index 7: " + character);

            // Get the length of the custom string
            int length = customString.length();
            System.out.println("Length of the custom string: " + length);
        }
    }
