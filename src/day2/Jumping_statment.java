package day2;

public class Jumping_statment {
    public static void main(String[] args){

        for (int i=1;i<=10;i++)
        {
            if (i==3 || i==5 || i==9)
            {
                continue; // breake
            }
            System.out.println(i);
        }

    }
}
