package day15;

public class CallByeRefernce {

    int a,b;
    CallByeRefernce(int i, int j){
        a = i;
        b = j;
    }

    void cla(CallByeRefernce o){
        o.a *=2;
        o.b /=2;
    }
}
class Run{
    public static void main(String[] args) {
        CallByeRefernce obj = new CallByeRefernce(40,60);
        System.out.println(" obj.a and obj.b before call "+ obj.a+" ,"+obj.b);

         obj.cla(obj);
        System.out.println(" obj.a and obj.b after call "+ obj.a+" ,"+obj.b);
    }
}
