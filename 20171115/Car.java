package kr.ac.kookmin.cs.oop.inheritance;

public class Car {
    Tire frontLeftTire = new Tire(6);
    Tire frontRightTire = new Tire(5);
    Tire rearLeftTire = new PremiumTire(4);
    Tire rearRightTire = new PremiumTire(5);

    int run() {
        System.out.println("Four wheels are running");
        if (frontLeftTire.roll() == false) {
            stop();
            return 1;
        }
        if (frontRightTire.roll() == false) {
            stop();
            return 2;
        }
        if (rearLeftTire.roll() == false) {
            stop();
            return 3;
        }
        if (rearRightTire.roll() == false) {
            stop();
            return 4;
        }
        return 0;
    }

    void stop() {
        System.out.println("The car stops");
    }

    public static void main(String[] args) {
        Car car = new Car();
        for (int i = 1; i <= 5; i++) {
            int runStatus = car.run();
            System.out.println("Car status: " + runStatus);
            if (runStatus != 0) {
                break;
            }
            // System.out.println(car);
        }
    }
}

