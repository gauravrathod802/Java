package TypeCasting.PrimitiveTypeCasting;

public class NarrowingTypeCasting {
    public static void main(String[] args) {
        int smallerDatatype = 12;
        double biggerDatatype = smallerDatatype;
        int smallerDatatype2=(int) biggerDatatype;  //narrowing
        System.out.println(smallerDatatype2);
    }
}
