package day16;


public class VarArgs2 {
    // use varargs with standard arguments
// here msg is not normal parameter but 'v' is varargs

    static void vaTest(String msg, int...v){
        System.out.print(msg+v.length+" contents : ");
        for (int x:v){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("one varargs: ",10);
        vaTest("second varargs: ",20,30,40);
        vaTest("third varargs: ");
    }

}
