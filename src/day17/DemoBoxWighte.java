package day17;

class Box{
    double width;
    double height;
    double depth;

    // construct clone of object
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // when all dimension specify
    Box(double w, double h, double d){
        width =w;
        height = h;
        depth=d;
    }
    // when no dimensional specify
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    // constructed when cube is created
    Box(double len){
        width = height = depth = len;
    }
    // compute the volume
    double volume(){
        return width*height*depth;
    }
}
class BoxWighte extends Box{

    double wighte;

    // constructor for class  and use the sipper keyword
    BoxWighte(double w, double h, double d, double m){
//        width = w;
//        height = h;
//        depth = d;
        super(w,h,d);  // call superclass constructor
        wighte = m;
    }
}

public class DemoBoxWighte {
    public static void main(String[] args) {
         BoxWighte mybox1 = new BoxWighte(10,20,30,34.4);
         BoxWighte mybox2 = new BoxWighte(15,17,25,30.5);
         double vol;

         vol = mybox1.volume();
        System.out.println(" volume of mybox1 : "+ vol);
        System.out.println("wighte of mybox1 is :"+mybox1.wighte);
        System.out.println();

        vol = mybox2.volume();
        System.out.println(" volume of mybox2 : "+ vol);
        System.out.println("wighte of mybox2 is :"+mybox2.wighte);


    }
}
