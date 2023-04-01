package day12;

class Test{
    int a,b;

    Test(int i, int j){
        a = i;
        b = j;
    }
    //return true if o is equal ti invoking object
    boolean equalTo( Test o) {
        if (o.a == a && o.b ==b) return true;
        else return false;
    }
}
public class passob {
    public static void main(String[] args) {
        Test obj1 = new Test(100,20);
        Test obj2 = new Test(100,20);
        Test obj3 = new Test(-1,-10);

        System.out.println("obj1 == obj2 : "+obj1.equalTo(obj2));
        System.out.println("obj1 == obj3 : "+obj1.equalTo(obj3));

    }
}
