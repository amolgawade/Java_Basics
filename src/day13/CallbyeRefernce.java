package day13;

// object are passed bye through reference

class Test{
    int a,b;

    Test(int i,int j){
        a = i;
        b = j;
    }
    // pass an object
    void result(Test o){
        System.out.println(" marks in mid term : "+ (o.a *=2));
        System.out.println("marks in end term : "+(o.b /= 2));
    }
}
public class CallbyeRefernce {
    public static void main(String[] args) {
        Test ob = new Test(80,85);
        System.out.println("ob.i and ob.j before calling : "+ ob.a +" "+ ob.b);

        System.out.println(" ");
        ob.result(ob);
        System.out.println("ob.i and ob.j after calling : "+ ob.a +" ,"+ ob.b);

    }
}
