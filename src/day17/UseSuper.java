package day17;
// use super to overcome hiding

class A1{
    int i , j;
}
class B1 extends A1{
    int j; // this j hide variable of 'j' in class A1

    B1(int a, int b){
        super.j = a;
        j = b;
    }

    void show(){
        System.out.println(" j in superclass "+super.j);
        System.out.println("j in subclass "+ j);
    }

}

public class UseSuper {
    public static void main(String[] args) {
        B1 obj =new B1(4,5);

        obj.show();
    }
}
