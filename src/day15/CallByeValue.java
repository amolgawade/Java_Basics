package day15;

public class CallByeValue {

    int meth(int i, int j){
        i = i*2;
        j = j/2;
        return i *j;
    }
}
class Test{
    public static void main(String[] args) {
        CallByeValue obj = new CallByeValue();
        int a = 20 , b= 30;

        System.out.println("before using the method a and b are "+ "a: "+a+" , b: "+b);
        // use method to pass value

        System.out.println(obj.meth(a,b));
        System.out.println(" after passing the value in method a and b are "+a +","+b);

    }
}