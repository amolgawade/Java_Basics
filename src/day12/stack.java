package day12;

public class stack {

    int stck[] = new int[10];
    int tos;

    // initialization of top of stack
    stack(){
        tos=-1;
    }

    // push item on the top
    void push(int item){
        if (tos==9)
            System.out.println("stack is full");
        else
            stck[++tos]=item;
    }
    // pop item from stack
    int pop(){
        if (tos<0) {
            System.out.println("stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class Teststack{
    public static void main(String[] args) {
        stack mystack1= new stack();
        stack mystack2= new stack();

        for (int i=0;i<10;i++) mystack1.push(i);
       // for (int i=10;i<20;i++) mystack2.push(i);

        System.out.println("-----stack in mystack1-----");
        for (int i=0; i<10; i++)
            System.out.print(mystack1.pop()+",");

        System.out.println(" ");
//        System.out.println("-----stack in mystack2-----");
//        for (int i=0; i<10; i++)
//            System.out.print(mystack2.pop()+",");
    }
}
