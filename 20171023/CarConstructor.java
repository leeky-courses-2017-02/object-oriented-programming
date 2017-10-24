package Class;

public class CarConstructor {
    String modelName;
    String manufacturer;
    int modelYear;

    public CarConstructor() {
        this.modelName = "apollo";
        this.manufacturer = "KMU";
        this.modelYear = 2006;
    }

    public CarConstructor(String modelName) {
        this.modelName = modelName;
        manufacturer = "KMU";
        modelYear = 0;
    }
    public CarConstructor(String model, String company, int year) {
        modelName = model;
        manufacturer = company;
        modelYear = year;
    }

    public CarConstructor(String model, String company) {
        this(model, company, 0);
    }

    int getAge(int currentYear) {
        int age = currentYear - this.modelYear;
        return age;
    }

    public static void main(String args[]) {
        CarConstructor carFieldCheck = new CarConstructor();
        System.out.println(carFieldCheck.modelName);
        System.out.println(carFieldCheck.manufacturer);
        System.out.println(carFieldCheck.modelYear);

        carFieldCheck = new CarConstructor("OOP", "leeky", 2014);
        System.out.println(carFieldCheck.modelName);
        System.out.println(carFieldCheck.manufacturer);
        System.out.println(carFieldCheck.modelYear);

        carFieldCheck = new CarConstructor("OOP", "leeky", 2014);
        System.out.println(carFieldCheck.getAge(2016));

        carFieldCheck = new CarConstructor("car", "id", 2010);
        System.out.println(carFieldCheck.getAge(2016));
    }

    void StartEngine() {

    }

}
