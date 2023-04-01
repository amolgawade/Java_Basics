package day12;
class cube3{
    double width;
    double height;
    double depth;

    // constructor
    cube3(double w, double h, double d){
        width =w;
        height=h;
        depth=d;
    }

    double volume(){
        return width*height*depth;
    }
}
public class Boxdemo5 {
    public static void main(String[] args) {
        cube3 mybox1= new cube3(10,20,30);
        cube3 mybox2= new cube3(88,20,36);

        System.out.println("volume is "+mybox1.volume());
        System.out.println("volume is "+mybox2.volume());

    }
}
