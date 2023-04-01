package day13;

class Science{
    void marks(int i,int j){
        System.out.println(" marks in mid term : "+ i);
        System.out.println("marks in end term : "+j);
    }
}

public class CallByeValue {
    public static void main(String[] args) {
        Science paper = new Science();

        int a = 80, b = 85;

        System.out.println("before call to the method : mid term a = "+a+" and  end term b = "+b);

        System.out.println();
        System.out.println("after calling by value ");
        paper.marks(a,b);
    }
}
