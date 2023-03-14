package day3;


public class Calculation
{
    int x= 10;
    int y= 20;

    /*void sum()  // case 1 :- this method  show (void = not returned value) empty bracket show no parameter
    {
        System.out.println(x+y);
    }*/

    /*int sum()  // case 2 :- this method  show (int = returned value) empty bracket show no parameter
    {
        return(x+y);
    }*/

    /*void sum(int a, int b)  // case 3 :- this method  show (void = not returned value) but bracket take parameter
    {
        System.out.println(a+b);
    }*/
    int sum(int a, int b)  // case 4 :- this method  show (int =  returned value) and  bracket take parameter
    {
        return (a+b);
    }


    public static void main(String[] args)
    {
        Calculation cal = new Calculation();
        //cal.sum(); // case 1
        //System.out.println(cal.sum()); // case -2

        //cal.sum(100,200); // case 3

        System.out.println(cal.sum(100,200));  // case 4
    }
}
