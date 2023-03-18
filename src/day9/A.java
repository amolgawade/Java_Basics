package day9;

public class A {
    void m1(){
        System.out.println("this is class A m1 method");
    }



    public static void main(String[] args)
    {
        A a = new A();
        a.m1();
        A b = new B();
        b.m1();
        A c = new C();
        c.m1();
    }
}

class  B extends A
{
    @Override
    public void m1(){
        System.out.println("this is class B method");
    }
}
class C extends A
{
    @Override
    public void m1(){
        System.out.println("this is class c method");
    }

}