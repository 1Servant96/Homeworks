package homework19;

import java.util.Scanner;

public enum DaysOfWeek {
    MONDAY ,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    static void day(){
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine().toUpperCase();
        DaysOfWeek days = DaysOfWeek.valueOf(a);
        switch(days){
            case MONDAY ->   System.out.println("Duishombu gunu techEnglish");
            case TUESDAY ->   System.out.println("Sheishembi gunu practiseSession ");
            case WEDNESDAY ->   System.out.println("Sharshembi gunu Talking club");
            case THURSDAY ->   System.out.println("Beishembi gunu softSkills");
            case FRIDAY ->   System.out.println("Zhuma gunu kun event");
            case SATURDAY ->   System.out.println("Ishembi gunu uborka ");
            case SUNDAY ->   System.out.println("Zhekshenbi gunu kitep okuu");
        }

    }


}
