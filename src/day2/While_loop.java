package day2;

public class While_loop {
    public static void main(String[] args){

        int i = 1;

        while (i<=10)
        { System.out.print(i+",");
            i++;
        }
        System.out.println(":-");
        // printing even numbers
        System.out.println("even numbers");
        int a = 2;
        while (a<=10)
        {
            System.out.println(a+",");
            a+=2;  // i = i+2
        }

        // printing ascending order
        System.out.println("ascending order");
        int b = 10;
        while (b>0)
        {
            System.out.print(b+",");
            b--;
        }
    }
}
