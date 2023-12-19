package TreakyQuestions;


interface A{
    abstract void m1();

}
interface B{
    abstract void m1();
}

public class Interface implements A,B{
    public static void main(String[] args) {
        Interface it=new Interface();
        it.m1();
    }
    public void m1(){
        System.out.println("A");
    }




}
