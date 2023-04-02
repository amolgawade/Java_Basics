package day17;

class SquareBox{
    private double width;
    private double height;
    private double depth;

    // construct clone of object
    SquareBox(SquareBox ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // when all dimension specify
    SquareBox(double w, double h, double d){
        width =w;
        height = h;
        depth=d;
    }
    // when no dimensional specify
    SquareBox(){
        width = -1;
        height = -1;
        depth = -1;
    }
    // constructed when cube is created
    SquareBox(double len){
        width = height = depth = len;
    }
    // compute the volume
    double volume(){
        return width*height*depth;
    }
}
class SolidBox extends SquareBox{
    double weight;

    // construct clone of object
    SolidBox(SolidBox ob){  // pass object to constructor
        super(ob);
        weight = ob.weight;
    }
    // constructor when all parameter specified
    SolidBox(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }
    // default constructor
    SolidBox (){
        super();
        weight = -1;
    }
    // constructor used when cube is created
    SolidBox(double len, double m){
        super(len);
        weight = m;
    }
}

public class Cube {
    public static void main(String[] args) {
        SolidBox mybox1 = new SolidBox(10, 20, 30, 15);
        SolidBox myclone = new SolidBox(mybox1);
        SolidBox mybox2 = new SolidBox();
        SolidBox mybox3 = new SolidBox(30, 15);
        double vol;

        vol = mybox1.volume();
        System.out.println("volume of mybox1 is : "+vol);
        System.out.println("weight of mybox1 is : "+mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("volume of mybox2 is : "+vol);
        System.out.println("weight of mybox2 is : "+mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("volume of mybox3 is : "+vol);
        System.out.println("weight of mybox3 is : "+mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("volume of myclone is : "+vol);
        System.out.println("weight of myclone is : "+myclone.weight);
        System.out.println();

    }
}
