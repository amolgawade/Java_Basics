package day4;

public class ConstructorOverlod
{
    ConstructorOverlod(int a,int b){
        System.out.println(a+b);
    }
    ConstructorOverlod(double a,int b){
        System.out.println(a+b);
    }
    ConstructorOverlod(double a,double b){
        System.out.println(a+b);
    }
    ConstructorOverlod(int a,int b,int c){
        System.out.println(a+b+c);
    }


    public static void main(String[] args)
    {
        ConstructorOverlod co=new ConstructorOverlod(10.5,20.4);

    }
}
