package day3.Assigment;
// finding even an odd in array
public class even_odd_array
{
    public static void main(String[] args)
    {
        int a[]={1,2,5,6,3,2,100,101,102,103,104,106,108,105,109};

        System.out.println("even numbers are");
        for (int i=0;i<a.length;i++)
        {
            if (a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }
        System.out.println("odd numbers are");
        for (int i=0;i<a.length;i++)
        {
            if (a[i]%2!=0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
