package day4;

public class ThisKeywords
{
    int a,b;

    void getvalues(int a,int b){
        this.a=a;
        this.b=b;
    }
    void printvalues(){
        System.out.println(a);
        System.out.println(b);
    }


    public static void main(String[] args) {
        ThisKeywords th=new ThisKeywords();
        th.getvalues(200,500);
        th.printvalues();

    }
}
