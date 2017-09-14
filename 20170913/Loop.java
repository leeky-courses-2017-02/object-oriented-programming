import java.io.IOException;

public class Loop {
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // System.out.println(i);
        // summing from 1 to ten
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum from 1 to 10 is " + sum);

        double interest = 0.03;
        int balance = 100000;
        for (int i = 0; i < 5; i++) {
            balance += (balance * interest);
            System.out.println((i + 1) + " year balance = " + balance);
        }

        // multiplication table
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "´Ü");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
        
        int index = 0;
        while (index <= 5) {
            System.out.println("index is " + index++);
        }
    }
}
