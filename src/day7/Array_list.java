package day7;

import java.util.ArrayList;
import java.util.Objects;

public class Array_list
{
    public static void main(String[] args) {

        //declare an array list

        // ArrayList list = new ArrayList(); / to declare any type of list

        ArrayList<String> list= new ArrayList<String>(); // to describe particular type

        // Adding values to list
        list.add("john");
        list.add("dev");
        list.add("robbin");
        list.add("dude");

        System.out.println("Before removing element");
        // size of array list
        System.out.println(list.size());
        System.out.println(list);

        // remove value in list
        System.out.println("After removing element");
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list);

        // inserting new element in array list
        System.out.println("After inserting element");
        list.add(2,"babu");
        System.out.println(list);
        System.out.println(list.size());

        for (Object s:list){
            System.out.println(s);
        }

    }
}
