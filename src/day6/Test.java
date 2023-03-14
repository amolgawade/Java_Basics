package day6;

interface A
{
    int a=10; // by default interface variable are static and final

    void m1(); // abstract method, publicly default

}

public class Test  implements A
{

    public void m1()
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Test t = new Test();
        t.m1();
    }
}
