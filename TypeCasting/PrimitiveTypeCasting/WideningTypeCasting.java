package TypeCasting.PrimitiveTypeCasting;

public class WideningTypeCasting {
    public static void main(String[] args) {
        int smallerDatatype = 12;
        double biggerDatatype = smallerDatatype;       //widening
        System.out.println(biggerDatatype);
    }
}