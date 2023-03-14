package day5.Assigment;

import day3.Calculation;

public class Calculator
{
    int x,y,z;
    double a,b,c;

    int Add2(int x, int y)
    {
       int sum = x+y ;
        return sum;
    }
    void Add3(int x,int y,int z)
    {
        System.out.println(x+y+z);
    }
    double Add(double x, double y)
    {
        double sum = (x+y);
        return sum ;
    }
    double Add3(double x,double y,double z)
    {
        double sum= (x+y+z);
        return sum;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.Add2(10,200));
        cal.Add3(100,200,400);
    }


}
