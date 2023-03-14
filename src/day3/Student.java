package day3;

public class Student
{
    int sid;
    String sname;
    char grade;


    Student(int id,String name,char g)  //  This is constructor
    {
        this.sid = id;
        this.sname= name;
        this.grade = g;
    }

    void getvalues(int id,String name,char g)  // This is method
    {
        this.sid = id;
        this.sname= name;
        this.grade = g;

    }
    void display()
    {
        System.out.println(sid+"  "+sname+"  "+grade    );
    }

}
