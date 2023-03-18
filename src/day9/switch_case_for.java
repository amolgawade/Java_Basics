package day9;

public class switch_case_for {
    public static void main(String[] args) {
        for(int i=0;i<6;i++)
            switch (i){
                case 0:System.out.println("this is zero");break;
                case 1:System.out.println("this is one");break;
                case 2:System.out.println("this is two");break;
                case 3:System.out.println("this is three");break;
                case 4:System.out.println("this is four");break;
                case 5:System.out.println("this is five");break;
                default:
                    System.out.println("i is greater than any one ");
            }
    }
}
