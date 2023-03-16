package day8;
// Finding hypotenuse of triangle

 public class Hypotenous {
    public static void main(String[] args) {

        double a=20.56, b=15.25;
        // c is hypotenuse
        double c= Math.sqrt(a * a + b * b);
        System.out.println("hypotenuse is :- "+c);

        int num;
        num= 100;
        System.out.println("The number is :- "+num);
        // Multiply by 2
        num = num*2;
        System.out.println(" The number is Multiply by 2:- "+num );
        System.out.println(num);
        if(num>100) System.out.println("number is grater than 100");
        if(num<100) System.out.println("number is less than 100");
        if(num == 100) System.out.println(" not equal to 200");
        else if (num == 200) {
            System.out.println("equal to 200");
        } ;

        int x;
        for(x=0;x<10;x++)
            System.out.println(x);


        int m ,n;
        n=20;
        for(m=0;m<10;m++) {
            System.out.println("this is m:- " + m);
            System.out.println("this is n:- " + n);
            n = n - 2;
        }




    }
}
