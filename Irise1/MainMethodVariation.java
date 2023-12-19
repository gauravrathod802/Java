package Irise1;

public class MainMethodVariation {
    public static void main(String[] args) {
//        if (System.out.println("Hello, world!") == null) {}
//
   }//work
//     static public void main (String[] args) {
//        System.out.println("hello");
//    }work
//    static public void main (String... args) {
//        System.out.println("hello");
//    } work
//    void static public main(String[] args) {
//        System.out.println("hello");
//    } doesn't work

//    private static void main(String[] args) {
//        System.out.println("hello");
//    } doesn't work


}
 class PrintWithoutSemicolon {
      private  PrintWithoutSemicolon(){

     }
     void display(){
         System.out.println("hello");
     }
    public static void main(String[] args) {
         PrintWithoutSemicolon pw= new PrintWithoutSemicolon();
         pw.display();

        if (System.out.printf("Hello, World") == null) {
        }
    }
}
