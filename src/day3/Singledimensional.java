package day3;

public class Singledimensional
{
    public static void main(String[] args) {
        /*int a[]= new int[5]; // Declaration of arrays

        // storing
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;*/
        int a[] = {100, 200, 300, 400, 500};
        System.out.println("length of an array is :-" + a.length);

        System.out.println("----------Specific value----------");
        System.out.println(a[3]); // specific value

        System.out.println("----------------for loop-----------");
        for (int i = 0; i <= a.length - 1; i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("----------Enhanced for loop-----------");
        for (int i:a)
        {
            System.out.println(i);
        }
    }
}
