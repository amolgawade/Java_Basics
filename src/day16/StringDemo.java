package day16;

public class StringDemo {
    public static void main(String[] args) {
        String strObj1 = "first string";
        String strObj2 = "second string";
        String strObj3 = strObj1;

        System.out.println(" length of string ob1 = "+strObj1.length());
        System.out.println(" length of string ob2 = "+strObj2.length());
        System.out.println(" length of string ob3 = "+strObj3.length());

        System.out.println(" char at index 3 is "+ strObj1.charAt(3));
        if (strObj1.equals(strObj2))
            System.out.println("strObj1==strObj2");
        else System.out.println("strObj1!=strObj2");

        if (strObj1.equals(strObj3))
            System.out.println("strObj1==strObj3");
        else System.out.println("strObj1!=strObj3");


    }
}
