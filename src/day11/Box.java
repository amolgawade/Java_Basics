package day11;

public class Box {
    double width;
    double height;
    double depth;
}
// this class declare an object of class Box

class Boxdemo{
    public static void main(String[] args) {
        // declaration of new object (mybox) and that object specific variable (volume)
        Box mybox= new Box();
        double volume;

        // declaration of instance variables that inheritate from class Box
        mybox.width=50;
        mybox.depth=20;
        mybox.height=100;

        // calculate volume

        volume = (mybox.depth*mybox.height*mybox.width);
        System.out.println("volume of mybox is : "+volume);

    }
}