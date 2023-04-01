package day11;

public class Breake_lable {
    public static void main(String[] args) {
        boolean t= true;

        first: {
            second: {
                third: {
                    System.out.println("before the brake");
                    if (t) break second;
                    System.out.println("not executed");

                    }
                System.out.println(" this also not executed");
            }
            System.out.println("after second block");
        }
    }
}
