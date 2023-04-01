package day12;

class Box{
    double width;
    double height;
    double depth;

    void volume(){
        System.out.println("calculating volume of box ...... ");
        System.out.println(width*height*depth);
    }
}

public class Boxdemo1 {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox2.depth=10;
        mybox2.width=20;
        mybox2.height=30;

        mybox1.height=20;
        mybox1.width=50;
        mybox1.depth=40;

        // displaying volume
        System.out.println(" mybox2 volume is ");
        mybox2.volume();
        System.out.println(" mybox1 volume is ");
        mybox1.volume();

    }
}
