package day2.Assigment;

import java.util.Scanner;

// count the length of number
public class Count_integer
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int a = num.nextInt();
        int count = 0;
        while (a != 0)
        {
            a = a/10;
            count++;
        }
        System.out.println("number count is :- "+count);



    }
}
