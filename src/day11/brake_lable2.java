package day11;

public class brake_lable2 {
    public static void main(String[] args) {
        outer: for (int i=0;i<3;i++){
            System.out.print("pass "+i+": ");
            for (int j=1;j<100;j++){
                if (j==11) break outer;  // try to remove outer word in code result is different
                System.out.print(j+" ");
            }
            System.out.println(" this print only when after brake liable is specified");
        }
        System.out.print(" loop complete");
    }
}
