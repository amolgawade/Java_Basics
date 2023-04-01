package day16;
// varargs overloading

import java.io.FilterOutputStream;

public class VarArgs3 {

    static void vaTest(int ...v){
        System.out.print("vaTest(int...) : "+v.length+" contents : ");

        for (int x:v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    static void vaTest(boolean ...v){
        System.out.print("vaTest(boolean...) : "+v.length+" contents : ");

        for (boolean x:v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    static void vaTest(String msg, int ...v){
        System.out.print("vaTest(String ,int...) : "+msg+v.length+" contents : ");

        for (int x:v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    int cal(int i,int j){
        System.out.print("clautaion is :");
        return i+j;
    }

    public static void main(String[] args) {
        vaTest(1,2,3,4,5);
        vaTest(true,false,true,false);
        vaTest("method overloading ",10,20,50,80);
        VarArgs3 ab = new VarArgs3();
        System.out.print(ab.cal(150,200));
    }
}
