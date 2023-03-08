package day3.Assigment;
//Search specific number in array


import java.util.Scanner;

public class search_in_array
{
    public static void main(String[] args)
    {
        int a[] = {100, 200, 300, 400, 500};
        Scanner s =new Scanner(System.in);
        System.out.println("enter the number");
        int m = s.nextInt();

        for (int i =0;i<a.length;i++)
        {
            if (m==a[i])
            {
                System.out.println(m+" value is present in array at location "+i);
            }
        }

    }
}
