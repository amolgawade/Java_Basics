package day12;


class cube5{
    double width;
    double height;
    double depth;

    // constructor when all dimension specifies
    cube5(double w,double h, double d){
        width =w;
        height= h;
        depth = d;
    }

    // constructor when no dimension provide
    cube5() {
        width = -1;
        height = -1;
        depth = -1;
    }
    // all dimension is same
    cube5(double len){
        width = height = depth = len;
    }

    double volume(){
        return height*width*depth;
    }

}
public class Boxdemo6 {
    public static void main(String[] args) {
        cube5 mycube1 = new cube5();
        cube5 mycube2 = new cube5(10,20,30);
        cube5 mycube3 = new cube5(30);

        double volume;

        System.out.println(" volume of mycube1 : "+ mycube1.volume());
        System.out.println(" volume of mycube2 : "+ mycube2.volume());
        System.out.println(" volume of mycube3 : "+ mycube3.volume());
    }
}
