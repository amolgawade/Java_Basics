package day5;

class A
{
    int a;
    void display(){
        System.out.println(a);
    }
}

class B extends A
{
    int b;
    void print(){
        System.out.println(b);
    }
}
class C extends B
{
    int c;
    void show(){
        System.out.println(c);
    }
}



public class inheritance
{
    public static void main(String[] args) {
        A aobj = new A();
        aobj.a = 100;
        aobj.display();


        System.out.println("----single level inheritance====---");
        B bobj = new B();
        bobj.b =500;
        bobj.a = 200;
        bobj.display();
        bobj.print();

        // multi level inheritance example
        System.out.println("----multi level inheritance====---");
        C cobj = new C();
        cobj.c=20;
        cobj.b=40;
        cobj.show();
        cobj.print();
    }
}
