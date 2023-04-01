package day14;

public class Test {
        public static void main(String[] args) {
            Car mycar = new Car();
            mycar.numberOfDoors=4;
            mycar.registrationNumber=1234;
            mycar.transferOwnership("Amol");

            //  Vehicle myvehicle = mycar;

            Vehicle myvehicle = new Car();
            myvehicle.transferOwnership("amit");
            System.out.println(myvehicle instanceof Car);

            // use of casting for --- mycar = myvehicle
            mycar = (Car) myvehicle;
            mycar.numberOfDoors=4;
            System.out.println("Vehicle data....");
            System.out.println("Registration number is "+myvehicle.registrationNumber);
            if (myvehicle instanceof Car){
                System.out.println("This is type of car");
                Car c;
                c=(Car)myvehicle;
                System.out.println("number of door "+c.numberOfDoors);


            }

        }
}

