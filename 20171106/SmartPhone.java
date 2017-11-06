package kr.ac.kookmin.cs.oop.inheritance;

public class SmartPhone extends CellPhone {
    private String appMarket;

    public SmartPhone(String model, String color, String appMarket) {
        this.model = model;
        this.color = color;
        this.appMarket = appMarket;
    }

    public void runBrowser() {
        System.out.println("Starting a smart phone web browser");
    }

    public static void main(String[] args) {
        SmartPhone cellPhone = new SmartPhone("KMU", "white", "Android");
        cellPhone.powerOn();
        cellPhone.runBrowser();

        CellPhone phone = new CellPhone();
        CellPhone typeCastingPhone = new SmartPhone("KMU", "white", "Android");
        typeCastingPhone.powerOn();
        typeCastingPhone.sendMessage();

        // SmartPhone smartPhone = new CellPhone();
        // typeCastingPhone.runBrowser();
    }
}
