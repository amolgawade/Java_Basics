package day2.Assigment;
// finding greatest number in given 3 number


import java.util.Scanner;

public class gretestnumber3
{
    public static void main(String[] args)
    {
        System.out.println("finding gretest number :-");
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first number a:-");
        int a = inp.nextInt();
        System.out.println("Enter first number b:-");
        int b = inp.nextInt();
        System.out.println("Enter first number c:-");
        int c = inp.nextInt();
        if (a>b & a>c)
        {
            System.out.println("a is greatest them all");
            if (b > c)
            {
                System.out.println("c is smallest and order is a>b>c ");
            } else {
                System.out.println("b is smallest and order is a>c>b");
            }
        }
        if (a<b & b>c)
        {
            System.out.println("b is greatest them all");
            if (a>c)
            {
                System.out.println("c is smallest and order is b>a>c");
            }else
            {
                System.out.println("a is smallest and order is b>c>a");
            }
        }
        if (c>b & a<c)
        {
            System.out.println("c is greatest them all");
            if (a>b)
            {
                System.out.println("b is smallest and order is c>a>b");
            }else
            {
                System.out.println("a is smallest and order is c>b>c");
            }
        }


    }

}
