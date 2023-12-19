package WrapperClass;

public class ArrayNumberCheck {
    public static void main(String[] args) {
        int arr[]={2,4454,1123,23,45,98};
        for (int n: arr) {
            String s=Integer.toString(n);
            boolean b=s.contains("4454");
            if(b==true){
                System.out.println(n);
            }
        }
    }
}
