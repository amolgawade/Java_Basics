package day3;

public class Employee
{
    int eid;
    String ename;
    double salary;
    int deptno;
    String job;

    void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(salary);
        System.out.println(deptno);
        System.out.println(job);
    }
    public static void main(String[] args)
    {
        Employee emp1= new Employee();  // creating object for employee
        emp1.eid=101;
        emp1.ename="amol";
        emp1.salary=20000;
        emp1.deptno=10;
        emp1.job="manager";
        emp1.display();

        Employee emp2= new Employee();  // creating object for employee
        emp2.eid=102;
        emp2.ename="john";
        emp2.salary=10000;
        emp2.deptno=10;
        emp2.job="ceo";
        emp2.display();


    }

}
