package day12;

class Cube2{
    double width;
    double height;
    double depth;

    Cube2(){
        System.out.println("constructing cube ....");
        width=10;
        height=20;
        depth=30;
    }
    double volume(){
        return width*height*depth;
    }
}

public class Boxdemo4 {
    public static void main(String[] args) {
        Cube2 mybox1 = new Cube2();
        Cube2 mybox2 = new Cube2();

        System.out.println(" volume of mybox2: "+mybox2.volume());
        System.out.println(" volume of mybox1: "+mybox1.volume());
    }
}
