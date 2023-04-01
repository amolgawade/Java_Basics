package day13;

class A {
    int i;
    String j;
}

public class Clone {
    public static void main(String[] args) {
        A a1 = new A();
        a1.i = 10;
        a1.j = "1";

        A a2 = a1;

        a2.i = 30;

        System.out.println(a1.i);
        int c = 10;
        m1(a2, c);

        System.out.println(a1.i + " " + c);

    }

    static void m1(A a3, int c1) {
        a3.i = 40;
        c1 = 50;
    }
}

