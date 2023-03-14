package day6;

public class chekedException {
    public static void main(String[] args) {
        System.out.println("program started");
        System.out.println("program in process");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("program completed");
        System.out.println("program is exited");
    }
}
