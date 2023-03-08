package day3;

public class PrivateEmployeeTest {

    public static void main(String[] args) {
        PrivateEmployee obj = new PrivateEmployee("Sandip", 1);
//        obj.setName("Sandip");
//        obj.setEmpId(1);
//        System.out.println(obj.getEmpId());
//        System.out.println(obj.getName());
        String name = obj.getName();
        System.out.println(name);
//        byte a= (byte)10000;
//        System.out.println(a);

    }
}
