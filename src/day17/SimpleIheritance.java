package day17;

class A{
    int i,j ;
    void showij(){
        System.out.println(" value of i and j : "+i+","+j);
    }
    private int m;

    private void showm(){
        System.out.println(" this  private and won't show outside the class A");
    }

    int cal(){
        System.out.println("calculation of i ,j and m is"+(i+j+m));
        return i+j+m;
    }
}
class B extends A {
    int k;

    void showk(){
        System.out.println("class B variable K: "+k);
    }

    private int l ;

    private void showl(){
        System.out.println("This class B private method");
    }
}

public class SimpleIheritance {
    public static void main(String[] args) {
        A superob = new A();
        B subob = new B();

        // supper class may be used by itself
        superob.i=20;
        superob.j=30;
        //superob.m    not taking it because it private variable
        //superob.showm   not taking it because it private method
         System.out.println("content in the supper A");
        superob.showij();
        superob.cal();
         // superob.k   not taking the public element of subclass
        System.out.println();

        // subclass access all public method and variable of its supper class
        subob.i=50;
        subob.j=80;
        subob.showij();
        subob.cal();
        System.out.println(" this are the class B members ");
        subob.k=20;
        subob.showk();






    }
}
