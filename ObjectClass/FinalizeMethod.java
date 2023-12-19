package ObjectClass;

public class FinalizeMethod {
    public static void main(String[] args) {
        FinalizeMethod f=new FinalizeMethod();
        System.out.println(f.hashCode());
        f=null;
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
