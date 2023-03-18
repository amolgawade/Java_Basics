package day9;

public class Missing_break {
    public static void main(String[] args) {

        for (int day=0;day<6;day++)
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
                    // no break statement here, so control will fall through to the next case
                case 5:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Weekend");
            }


    }
}
