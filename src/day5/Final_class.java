package day5;

final class Bike1 // final class canot extend into child class
{
    void run() // this final method cannot be over ride
    {
        System.out.println("Running in 100 Rpm");
    }
}
/*class Honda1 extends Bike1 // compile time error
{
    // void run() /// compile error
    {
        System.out.println("started.......");
    }
}*/


public class Final_class
{

}
