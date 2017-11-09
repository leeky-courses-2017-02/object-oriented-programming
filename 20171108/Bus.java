package kr.ac.kookmin.cs.oop.inheritance;

public class Bus extends Car {
    @Override
    public int run() {
        System.out.println("Bus is running");
        super.run();
        return 1;
    }

    @Override
    public String toString() {
        return "this is a bus class";
    }
}
