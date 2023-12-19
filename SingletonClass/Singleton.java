package SingletonClass;

public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}

class Test{

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        System.out.println(obj1+"   "+obj2+"   "+obj3);   //only one object is created
    }
}