package day12;

class Box1{
    double w;
    double h;
    double d;

    double volume(){
        return w*h*d;
    }
}

public class Boxdemo2 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        double vol;

        mybox2.d=20;
        mybox2.h=20;
        mybox2.w=20;

        mybox1.w=40;
        mybox1.d=40;
        mybox1.h=40;


        vol = mybox1.volume();
        System.out.println("volume is "+vol);

        vol = mybox2.volume();
        System.out.println("volume is "+vol);
    }
}
