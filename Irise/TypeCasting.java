package Irise;

//type casting: 1.primitive type casting 2.object type casting

public class TypeCasting {

    public static void main(String[] args) {
        int smallerDatatype=12;
        double biggerDatatype=smallerDatatype;       //widening
        System.out.println(biggerDatatype);

        int smallerDatatype2=(int) biggerDatatype;  //narrowing
        System.out.println(smallerDatatype2);
    }
}
