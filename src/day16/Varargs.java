package day16;
// demonstrate variable length arguments  here variable length argument define by three periods (...) then variable
// v as array

public class Varargs {
    static void vaTest(int ...v){
        System.out.print("number of arguments: "+v.length+" contents : ");
        for (int x:v){
            System.out.print(x+",");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // how vatest will be called

        vaTest(10);
        vaTest(10,20,30,4,5,6);
        vaTest();
    }

}
