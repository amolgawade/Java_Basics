package day10;

public class For_Multi_array {
    public static void main(String[] args) {
        int sum=0;
        int[][] nums= new int[3][5];

        // create new multi array
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                nums[i][j]=(i+1)*(j+1);
            }
        }
        System.out.println(nums);
        // to Display value in multi array
        for (int x[]:nums){
            for (int y :x){
                System.out.println("value is : "+y);
                sum += y;
            }

        }
        System.out.println(" summation of nums : "+sum );
    }
}
