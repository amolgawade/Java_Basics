package day14;


class Retest{
    int value[];

    Retest(int i){
        value = new int[i];
    }
    // dispaly an array

    void printArray(int i){
        if (i==0) return;
        else printArray(i-1);
        System.out.println("["+(i-1)+"]"+value[i-1]);
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        Retest ob = new Retest(10);
        int i ;

        for (i=0;i<10;i++) ob.value[i]=i;
        ob.printArray(10);
    }
}
