package day13;

class cube{
    double width;
    double height;
    double depth;

    // constructor taking object of this class as parameter
    cube(cube ob){  // passing object as parametr in constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    cube(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    cube(double len){
        width = height = depth =len;
    }

    cube(){
        width =-1;
        height = -1;
        depth = -1;
    }

    double volume(){
        return width*height*depth;
    }
}

public class Box {
    public static void main(String[] args) {
        cube c1 = new cube();
        cube c2 = new cube(10,20,30);
        cube c3 = new cube(10);

        // passing object to cinstructor

        cube myclone = new cube(c2);
        System.out.println(" clacilating volume of all objects ......");

        System.out.println();

        System.out.println("volume of c1 : "+c1.volume());
        System.out.println("volume of c2 : "+c2.volume());
        System.out.println("volume of c3 : "+c3.volume());
        System.out.println("volume of myclone : "+myclone.volume());

    }
}
