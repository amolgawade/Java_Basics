package day7;

import java.util.HashMap;
import java.util.Map;

public class Hasmapdemo
{
    public static void main(String[] args)
    {
        // declaration hasmap

       // HashMap hm = new HashMap();
        HashMap<Integer,String> hm= new HashMap<Integer,String>();

        // Adding pairs in to hasmap
        hm.put(101,"john");
        hm.put(102,"dev");
        hm.put(103,"scot");
        hm.put(104,"jun");
        hm.put(105,"may");

        System.out.println(hm);
        // remove pair from hasmap
        System.out.println("--------------");
        hm.remove(103);
        System.out.println("after removing 103:- "+hm);

        for (Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());

        }
        float f1= 20.5f;



    }
}
