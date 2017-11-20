package kr.ac.kookmin.cs.oop.inheritance;

public class EconomicTire extends Tire {
    public EconomicTire(int maxRotation) {
        super(maxRotation);
    }

    @Override
    public boolean roll() {
        accumulatedRotation += 2;
        return checkTireLongevity();
    }
}
