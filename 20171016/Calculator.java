package Class;

public class Calculator {
    boolean on = false;
    // methods
    void powerOn() {
        on = true;
        System.out.println("Calculator ON");
    }

    int plus(int x, int y) {
        int result = x + y;
        System.out.println("Two int variables sum");
        return result;
    }

    int plus(int x, double y) {
        return x + (int) y;
    }

    int plus(double x, int y) {
        return (int) x + y;
    }

    int plus(int x, int y, int z) {
        return x + y + z;
    }

    double plus(double x, double y) {
        double result = x + y;
        System.out.println("Two double variables sum");
        return result;
    }

    int sums(int[] inputs) {
        int sum = 0;
        for (int i : inputs) {
            sum += i;
        }
        return sum;
    }

    int sumArray(int... inputs) {
        int sum = 0;
        for (int i : inputs) {
            sum += i;
        }
        return sum;
    }
    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }
    double average(int... inputs) {
        int sum = sumArray(inputs);
        return divide(sum, inputs.length);
    }
    void powerOff() {
        on = false;
        System.out.println("Calculator OFF");
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.powerOn();

        int[] numbers = { 10, 9, 8, 7, 6 };
        System.out.println(calculator.sumArray(numbers));
        System.out.println(calculator.sumArray(new int[] { 1, 2 }));
        System.out.println(calculator.average(numbers));

        int sum1 = calculator.plus(3, 10);
        double sum2 = calculator.plus(2.5, 5.1);


        double result = calculator.divide(10, 3);
        System.out.println(result);

        System.out.println("hello world");
        System.out.println(12345);
        System.out.println(123.45);
        calculator.powerOff();

    }
}

