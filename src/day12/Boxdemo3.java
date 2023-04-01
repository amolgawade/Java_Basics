package day12;

class Cube {
    double width;
    double height;
    double depth;

    double volume(){
        return width*height*depth;
    }

    void setdim(double w,double h,double d){
        width = w;
        height= h;
        depth = d;
    }
}


public class Boxdemo3 {
    public static void main(String[] args) {
        Cube mybox1 = new Cube();
        Cube mybox2 = new Cube();

        mybox2.setdim(10,20,15);
        mybox1.setdim(10,10,10);

        System.out.println(" volume of mybox2: "+mybox2.volume());
        System.out.println(" volume of mybox1: "+mybox1.volume());

    }
}
