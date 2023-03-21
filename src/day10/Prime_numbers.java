package day10;

public class Prime_numbers {
    public static void main(String[] args) {
        int num;
        boolean isprime;

        num = 100;

        if (num < 2) isprime=false;
        else isprime=true;

        for (int i=2; i <= num/i; i++){
            if ((num % i) == 0) {
                isprime = false;
                break;

            }
        }
        if (isprime) System.out.println(num+": is Prime");
        else System.out.println(num+" : is not Prime");
    }
}
