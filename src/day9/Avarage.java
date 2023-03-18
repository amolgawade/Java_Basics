package day9;

public class Avarage
{
    public static void main(String[] args) {
        double num[] = {10.5,20.23,30.30,40.12,60.12};
        double result =0;
        int i;
        for (i=0;i<5;i++)
        {
            result=result+num[i];

        }
        System.out.println("Average of them is :- "+ result/5);
    }
}
