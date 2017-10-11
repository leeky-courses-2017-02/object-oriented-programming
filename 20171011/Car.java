
public class Car {
    String name;
    String color;
    String company;
    String type;

    int direction; // 1: 직진, 2: 후진, 3: 왼쪽, 4:오른쪽
    int power;
    int currentSpeed;
    int maxSpeed;
    int manufacturedYear;

    int steer(int coordinate) {
        // 입력으로 받은 coordinate 에 따라서
        // field에 있는 direction값을 바꿔줌.
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
