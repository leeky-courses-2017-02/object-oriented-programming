package kr.ac.kookmin.cs.oop.inheritance;

public class Tire {
    private final int maxRotation;
    protected int accumulatedRotation;

    public Tire(int maxRotation) {
        this.maxRotation = maxRotation;
        this.accumulatedRotation = 0;
    }

    public boolean roll() {
        ++accumulatedRotation;
        return checkTireLongevity();
    }

    public int getRemainingRotations() {
        return this.maxRotation - this.accumulatedRotation;
    }

    protected boolean checkTireLongevity() {
        if (accumulatedRotation < maxRotation) {
            System.out.println(" rotation remaining : " + getRemainingRotations());
            return true;
        } else {
            System.out.println(" has to be replaced");
            return false;
        }
    }
}
