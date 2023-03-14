package day4;

public class MethodOverloding
{

    void Add(int a,int b)
    {
        System.out.println(a+b);
    }
    void Add(int a,double b)
    {
        System.out.println(a+b);
    }
    void Add(double a,double b)
    {
        System.out.println(a+b);
    }
    void Add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }


    public static void main(String[] args)
    {
        MethodOverloding mo =new MethodOverloding();
        mo.Add(10,20);
        mo.Add(10,20,30);
        mo.Add(10,20);
        mo.Add(10,20.5);
    }
}
