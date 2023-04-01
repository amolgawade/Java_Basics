package day16;
class Outer{
    int outer_x = 20;

    void  test(){
        Inner inner = new Inner();
        inner.display();
    }
    // defining inner class
    class Inner{

        void display(){
            System.out.println(" display the outer element x : "+outer_x);
        }
    }

}
public class NestedDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
