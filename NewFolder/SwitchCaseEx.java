package NewFolder;

import java.util.Scanner;

public class SwitchCaseEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day= sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }

        switch (day) {
            //this feature is not supported by java 1.8
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
        }

    }
}
