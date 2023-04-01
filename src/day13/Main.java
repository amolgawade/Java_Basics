package day13;

public class Main {
    public static void main(String[] args) {
        int num = 4848456;
        int sum = sumDigits(num);
        System.out.println("The sum of the digits in " + num + " is " + sum);
    }

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }
}
