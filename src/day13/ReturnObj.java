package day13;
class Test1{
    int a;

    Test1(int i){
        a = i;
    }

    Test1 incrByTen(){
        Test1 temp = new Test1(a +10);
        return temp;
    }

}
public class ReturnObj {
    public static void main(String[] args) {
        Test1 obj = new Test1(2);
        Test1 obj2;

        obj2 = obj.incrByTen();
        System.out.println("obj.a "+obj.a);
        System.out.println("obj2.a "+obj2.a);

        System.out.println(obj2.a);
        // creating another object
        obj2 =obj2.incrByTen();
        System.out.println(" afetr second increment "+ obj2.a);

        System.out.println(obj2.a);
    }
}
