import java.util.*;


class Palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String name=sc.next();
String rev="";

for(int i=name.length()-1;i>=0;i--){    //3   3>=0
  rev=rev+name.charAt(i);
  //System.out.println(name.charAt(i));
 }
//System.out.println(rev);

if(rev.equals(name)){
System.out.println("String is palindrome");
}
else{
System.out.println("String is not palindrome");
}





}

}