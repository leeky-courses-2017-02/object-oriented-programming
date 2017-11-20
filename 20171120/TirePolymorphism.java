package kr.ac.kookmin.cs.oop.inheritance;

public class TirePolymorphism {
    private final int maxRotation;
    protected int accumulatedRotation;

    public TirePolymorphism(int maxRotation) {
        this.maxRotation = maxRotation;
        this.accumulatedRotation = 0;
    }

    public void incrementRotation() {
        ++accumulatedRotation;
    }

    public boolean roll() {
        incrementRotation();
        return checkTireLongevity();
    }

    public int getRemainingRotations() {
        return this.maxRotation - this.accumulatedRotation;
    }

    protected boolean checkTireLongevity() {
        if (accumulatedRotation < maxRotation) {
            return true;
        } else {
            return false;
        }
    }
}
