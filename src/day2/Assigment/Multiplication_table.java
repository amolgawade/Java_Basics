package day2.Assigment;

import java.util.Scanner;

public class Multiplication_table
{
    public static void main(String[] args)
    {
        System.out.println("--Multiplication table--");
        System.out.println("--enter the number --");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(num+ " * "+i+" = "+(num*i) );
            i++;
        }




    }
}
