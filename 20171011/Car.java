
public class Car {
    String name;
    String color;
    String company;
    String type;

    int direction; // 1: ����, 2: ����, 3: ����, 4:������
    int power;
    int currentSpeed;
    int maxSpeed;
    int manufacturedYear;

    int steer(int coordinate) {
        // �Է����� ���� coordinate �� ����
        // field�� �ִ� direction���� �ٲ���.
        direction = coordinate;
        return direction;
    }

    int accelerate() {
        currentSpeed++;
        return currentSpeed;
    }

    int brake() {
        currentSpeed--;
        return currentSpeed;
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Current speed is " + myCar.currentSpeed);
        myCar.accelerate();
        System.out.println("Current speed is " + myCar.currentSpeed);
    }
}
