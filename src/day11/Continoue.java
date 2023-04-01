package day11;

public class Continoue {
    public static void main(String[] args) {

        for (int i=0; i<10;i++){
            System.out.print("pass "+i+" ");
            if (i%2==0) continue;
            System.out.println("@");
        }
    }
}
