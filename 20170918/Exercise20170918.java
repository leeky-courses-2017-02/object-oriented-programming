import java.io.IOException;

public class Exercise20170918 {
    public static void main(String[] args) throws IOException {

        // multiplication table
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "´Ü");
            for (int j = 1; j <= 9; j++) {
                if (j == 4) {
                    continue;
                }
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }

        int index = 0;
        while (index <= 5) {
            System.out.println("index is " + index++);
        }

        while (true) {
            int num = (int) (Math.random() * 6) + 1;
            if (num == 6) {
                break;
            } else {
                System.out.println("a number from a dice: " + num);
            }
        }

        int num = 0;
        do {
            num = (int) (Math.random() * 6) + 1;
            System.out.println("a number from a dice: " + num);

        } while (num != 6);

        System.out.println("Exit from a dice");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        int outerIndex = 0;
        for (;;) {
            System.out.println(outerIndex++);
            if (outerIndex > 10) {
                break;
            }
        }

        for (int outerIndex1 = 0; outerIndex1 <= 10; outerIndex1++) {
            System.out.println(outerIndex1);
        }

        // Calculate counter and min/max
        int min = Integer.MAX_VALUE;
        int max = -1;
        int counter = 0;
        for (int i = 0; i < 100; ++i) {
            counter++;
            System.out.println("current run: " + counter);
            num = (int) (Math.random() * 100000);
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }
        System.out.println("min is " + min + " max is " + max);

        String name = "object oriented programming";
        System.out.println(name);

        char thirdChar = name.charAt(2);
        System.out.println(thirdChar);

        String subject1 = "object oriented programming";
        String subject2 = "open source software";
        boolean isSubject1Same = name.equals(subject1);
        boolean isSubject2Same = name.equals(subject2);
        System.out.println("subject1 : " + isSubject1Same + " subject2: " + isSubject2Same);

        int indexOfProgram = name.indexOf("programming");
        System.out.println(indexOfProgram);
        System.out.println(name.indexOf("software"));

        System.out.println(name.length());

        System.out.println(name.substring(7, 15));

        System.out.println(name.toUpperCase());
        System.out.println("KOOKMIN UNIV".toLowerCase());
    }
}
