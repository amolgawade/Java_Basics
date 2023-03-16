package day8;

public class NestedVariable {
    public static void main(String[] args) {
        int x;
        x=10;
        //int y=100;
        if(x==10) {
            int y = 20;
            System.out.println("x and y is :- " + x + ", " + y);
            x=y*2;
        }
        System.out.println("x is :- "+x);
       // int y= 200;
        //System.out.println("y is :- "+y);
    }
}
