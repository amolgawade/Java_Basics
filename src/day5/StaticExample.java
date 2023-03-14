package day5;

public class StaticExample
{
    static int a=10;  // static variable
    int b = 20; // non static variable


    static void m1()
    {
        System.out.println("this is static method m1");
    }
    void m2()
    {
        System.out.println("this is non statis method m2");
    }
    void m3()
    {
        System.out.println("------- non statis method 3------");
        System.out.println("this is non statis method 3");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args)
    {
        System.out.println(a); // static variable and method can access directly  ie. without object
        m1();
        // System.out.println(b);  // wrong because it non_static method


        // Static method can also access non statis method through object
        StaticExample se = new StaticExample(); // object creation
        se.m2();
        System.out.println(se.b);
        se.m3();
    }

}
