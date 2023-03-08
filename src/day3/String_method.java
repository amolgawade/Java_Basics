package day3;

public class String_method
{
    public static void main(String[] args)
    {
        String s = "Welcome";
        String s2 =" to java";

        System.out.println("-----length of string-----");
        System.out.println("length of string :- "+s.length());

        System.out.println("-----concatenating of string-----");
        System.out.println(s.concat(s2));

        System.out.println("-----triming of string-----");
        s = "    Welcome   ";
        System.out.println("before triming :-"+s);
        System.out.println("after triming :- "+s.trim());

        s = "Welcome";
        System.out.println(s.charAt(3));
        System.out.println(s.contains("Wel"));
        System.out.println(s.equals("Welcome"));

        System.out.println(s.substring(1,4));
        System.out.println(s.substring(0,4));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

    }
}
