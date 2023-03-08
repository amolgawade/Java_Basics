package day3.Assigment;
// sum of all elements in arrays


public class Sum_of_arrays
{
    public static void main(String[] args)
    {
        int a[] = {100, 200, 300, 400, 500};
        int sum= 0;

        for (int i=0;i<a.length;i++)
        {
            sum =sum+a[i];
        }
        System.out.println(sum);

    }
}
