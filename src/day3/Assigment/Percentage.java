package day3.Assigment;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {

        System.out.println("calculating ssc percentage ");
        Scanner m= new Scanner(System.in);
        System.out.print("enter the first subject mark:- ");
        float s1 = m.nextFloat();
        System.out.print("enter the second subject mark:- ");
        float s2 = m.nextFloat();
        System.out.print("enter the third subject mark:- ");
        float s3 = m.nextFloat();
        System.out.print("enter the fourth subject mark:- ");
        float s4 = m.nextFloat();
        System.out.print("enter the fifth subject mark:- ");
        float s5 = m.nextFloat();

        float Total = s1+s2+s3+s4+s5;
        System.out.println("The percentage of your ssc board is ");

        float percentage = (Total/500)*100;
        System.out.println(percentage);


    }
}
