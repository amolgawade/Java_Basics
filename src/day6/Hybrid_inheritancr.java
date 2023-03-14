package day6;

class A1{
    void m1(){
        System.out.println(" This is m1 method from class A1");
    }
}
interface B1
{
    void m2();
}
interface  B2
{
    void m3();
}



public class Hybrid_inheritancr extends A1 implements B1,B2
{
    public void m2(){
        System.out.println("This method m2 from interface B1");
    }
    public void m3(){
        System.out.println(" This Method m3 from interface B2");
    }

    public static void main(String[] args)
    {
        Hybrid_inheritancr mi = new Hybrid_inheritancr();
        mi.m2();
        mi.m1();
        mi.m3();
    }
}
