package day12;

class overlode{
    void test() {
        System.out.println("no parameter");
    }
    void test(int a, int b){
        System.out.println("addition is"+(a+b));
    }
    void test(double a){
        System.out.println("inside of double test a; "+a);
    }
}

public class overlodedemo {
    public static void main(String[] args) {
        overlode over = new overlode();
        int i=88;

        over.test();
        over.test(i);
        over.test(10,20);
        over.test(132.2);
    }

}
