package Irise;

import java.util.Scanner;

public class DayTime {
    public static void main(String[] args) {
        int time=1;
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.equals("am")){                                         //12am-6am night       6am-11.59am morning
            if(time>=6 && time<12){
                System.out.println("Good Morning");
            }
            else if(time<6){
                System.out.println("Good Night");
            }
        }else if(s.equals("pm")){                                   //1pm-4pm afternoon    5pm-8pm evening
            if(time>=1 && time<5){
                System.out.println("Good Afternoon");
            }
            else if(time>=5 && time<9){
                System.out.println("Good Evening");
            }
            else{
                System.out.println("Good Night");
            }
        }

        }

}


//6-12 morning
//12-6 afternoon
//6-12 night

