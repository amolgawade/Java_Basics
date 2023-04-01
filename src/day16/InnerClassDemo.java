package day16;

class Outer1{
    int outer_x = 50;

    void test(){
        for (int i=0; i<10; i++) {
            int I = i;
            class Inner1 {
                void display() {
                    System.out.println("display outer_x : " + outer_x+" and i is "+ I);
                }
            }
            Inner1 inner = new Inner1();
            inner.display();
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.test();
    }
}
