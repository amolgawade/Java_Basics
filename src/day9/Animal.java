package day9;


import java.util.Scanner;

public class Animal
{
    public static void main(String[] args) {
        System.out.println("enter the color of your animal");
        Animal a= new Animal();

        a.color();
        a.legs();
    }

    Scanner s = new Scanner(System.in);
    String type = s.nextLine();
    void color()
    {
        System.out.println("The color of Animal is "+type);

    }
    void legs()
    {
        System.out.println("It has two leg");
    }


}
