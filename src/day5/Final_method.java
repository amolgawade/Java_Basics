package day5;

class Bike
{
    final void run() // this final method cannot be over ride
    {
        System.out.println("Running in 100 Rpm");
    }
}
class Honda extends Bike
{
   // void run() /// compile error
    {
        System.out.println("started.......");
    }
}



public class Final_method
{

}
