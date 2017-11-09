package kr.ac.kookmin.cs.oop.inheritance;

public class Car {
    public int run() {
        System.out.println("Car is running");
        return 0;
    }

    public static void main(String[] args) {
        Car car = new Bus();

        System.out.println(car);
    }
}
