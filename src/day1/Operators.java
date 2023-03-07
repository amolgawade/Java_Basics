package day1;

public class Operators {
    public static void main(String[] args){

        int a = 10;
        int b = 20;

        // arthemtic operations
        System.out.println("sum of a and b :" + (a+b));
        System.out.println("dif of a and b :" + (a-b));
        System.out.println("mul of a and b :" + (a*b));
        System.out.println("div of a and b :" + (a/b));
        System.out.println("mod of a and b :" + (a%b));
        System.out.println("---------------");

        // Relation operators boolean value
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println("---------------");

        // boolean operator  && || !
        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);
        System.out.println("---------------");

        a = 55;
        a++;
        System.out.println("a = "+a);

        b= 60;
        b--;
        System.out.println("b = "+b);

        System.out.print("Hello");
        System.out.println(" My name is Amol ");
        System.out.println(" -------------");
        int m = 76;
        int n = 24;
        System.out.println("sum of m and n is :"+(m+n));


        System.out.println("*************swap two number**********");
        int S = 20;
        int R = 30;
        System.out.println("S is = "+S);
        System.out.println("R is = "+R);

        int temp = S;
        S = R;
        R = temp;
        System.out.println("After swapping ");
        System.out.print(" S is = "+S+"R is = "+R);





    }
}
