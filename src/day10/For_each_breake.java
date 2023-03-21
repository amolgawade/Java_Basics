package day10;

public class For_each_breake {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int sum=0;

        for (int x:nums){
            System.out.println("value is:- "+ x);
            sum +=x;
            if (x==7) break;

        }
        System.out.println(" summation of first seven number is : "+sum);
    }
}
