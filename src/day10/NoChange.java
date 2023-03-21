package day10;

public class NoChange {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,10};

        for (int x:num){
            System.out.print(" x is : "+x+",");
            x = x*10;

        }
        System.out.println(" ");
        System.out.println("____Trying to update num array____");
        for (int x:num){
            System.out.print("now x is : "+x+",");
        }
    }
}
