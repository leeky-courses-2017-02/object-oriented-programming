package kr.ac.kookmin.cs.oop.inheritance;

public class EconomicTirePolymorphism extends TirePolymorphism {
    public EconomicTirePolymorphism(int maxRotation) {
        super(maxRotation);
    }

    @Override
    public void incrementRotation() {
        accumulatedRotation += 2;
    }
}
