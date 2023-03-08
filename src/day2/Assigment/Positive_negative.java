package day2.Assigment;

import java.util.Scanner;

// get number from user and to find positive or negative
public class Positive_negative {
    public static void main(String[] args){
        System.out.println("It works");

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number 1 :-");
        int a= inp.nextInt();
       if (a>0)
       {
           System.out.println("Number is Positive");
       }
       else if (a<0)
       {
           System.out.println("Number is Negative");
       }
       else
       {
           System.out.println("Number is not Positive or Negative");
       }
    }
}
