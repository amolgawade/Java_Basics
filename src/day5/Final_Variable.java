package day5;

public class Final_Variable
{
     final int speed = 400;


    public static void main(String[] args)
    {
        Final_Variable fv = new Final_Variable();
        //fv.speed= 100; // compile time error
        System.out.println(fv.speed);

    }
}
