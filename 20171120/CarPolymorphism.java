package kr.ac.kookmin.cs.oop.inheritance;

public class CarPolymorphism {
    TirePolymorphism tires[];
    
    public CarPolymorphism() {
        tires = new TirePolymorphism[4];
    }

    int run() {
        System.out.println("Four wheels are running");
        for (int i = 0; i< tires.length; i++) {
            if (tires[i].roll() == false) {
                return i;
            }
        }
        return 4;
    }

    public void replaceTire(int index, TirePolymorphism tire) {
        tires[index] = tire;
    }
    
    public void stop() {
        System.out.println("The car stops");
    }

    @Override
    public String toString() {
        String outputString = "";
        for (int i = 0; i < tires.length; ++i) {
            outputString += i;
            outputString += " th tire remaining rotation = ";
            outputString += tires[i].getRemainingRotations();
            outputString += " ";
        }
        return outputString;
    }

    public static void main(String[] args) {
        CarPolymorphism car = new CarPolymorphism();
        while (true) {
            int carStatus = car.run();
            if (carStatus != 4) {
                int tireIndex = (int) (Math.random() * 3); // 0, 1, 2
                TirePolymorphism tireToReplace = null;
                if (tireIndex == 0) {
                    tireToReplace = new TirePolymorphism(10);
                } else if (tireIndex == 1) {
                    tireToReplace = new PremiumTirePolymorphism(10);
                } else if (tireIndex == 2) {
                    tireToReplace = new EconomicTirePolymorphism(10);
                }
                car.replaceTire(carStatus, tireToReplace);
            }
            System.out.println(car);
        }
    }
}

