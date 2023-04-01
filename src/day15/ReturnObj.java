package day15;

class  Rest{
    int a;
    Rest(int i){
        a= i;
    }
    Rest incryByTen(){
        Rest temp = new Rest(a+10);
        return temp;
    }


}


public class ReturnObj {
    public static void main(String[] args) {
        Rest obj = new Rest(2);
        Rest obj2;

        obj2 = obj.incryByTen();
        System.out.println("obj.a "+obj.a);
        System.out.println("obj2.a "+obj2.a);

        obj2 = obj2.incryByTen();
        System.out.println("after second increament " +obj2.a);

        int a1[] = new int[10];
        int a2[] = { 5,4,3,2,1,10,11,1,2,13,1,4,5,9,7,332,6,32,554,23,654,322,251,};
        int a3[]= {5615,4565,15,1,161,15,161,6515,161,65,14,1,11,16,651549,3,1650,320,51,11
        ,121,61,0,1,11,651,94,23,1566,23,165,0,8974,21,231,1,50,61,51,621,17,
        561,0,161,2,89,56,13,1,89,0,165,9};

        System.out.println("length of array a1 :"+a1.length);
        System.out.println("length of array a2 :"+a2.length);
        System.out.println("length of array a3 :"+a3.length);
    }

}
