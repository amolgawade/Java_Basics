package day5;

public class Animal
{
    String color = "white";

    void show(){
        System.out.println("Animal has a color");
    }
    Animal(){
        System.out.println("Animal is created ");
    }
}

class dog extends Animal
{
    String color = "Black";

    dog(){
        super(); // invoke parent class constructor
        System.out.println("dog is created");

    }

    /*void displaycolor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }

    void show(){
        System.out.println("Animal dog is white in color");
        super.show();
    }*/
}