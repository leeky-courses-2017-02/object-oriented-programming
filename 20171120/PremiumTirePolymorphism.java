package kr.ac.kookmin.cs.oop.inheritance;

public class PremiumTirePolymorphism extends TirePolymorphism {
    public PremiumTirePolymorphism(int maxRotation) {
        super(maxRotation);
    }

    @Override
    public void incrementRotation() {
        if (Math.random() < 0.5) {
            ++accumulatedRotation;
        }
    }
}
