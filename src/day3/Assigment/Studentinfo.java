package day3.Assigment;

public class Studentinfo
{
    int sid;
    String sname;
    int sub1;
    int sub2;
    int sub3;


    Studentinfo(int id,String name,int marathi,int eng,int math)  //  This is constructor
    {
        this.sid = id;
        this.sname= name;
        this.sub1 = marathi;
        this.sub2=eng;
        this.sub3=math;

    }

    float percentage(){
        return ((float)(this.sub1+ this.sub2 + this.sub3)/300)*100;
    }

    void getStuData()
    {
         System.out.println("id= "+sid+" name= "+sname);
    }

    void printData(int id, String name)
    {
        System.out.println("id= "+id+" name= "+name);
    }
    float totalmarks(){
        return ((float)(this.sub1+ this.sub2 + this.sub3));
    }





    public static void main(String[] args)
    {
        Studentinfo studentinfo1 = new Studentinfo(1, "Amol", 80, 75, 70);
        System.out.println(studentinfo1.percentage());
        studentinfo1.getStuData();
        studentinfo1.printData(1, "Sandip");
        System.out.println(studentinfo1.totalmarks());
    }
}
