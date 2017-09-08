
public class Exercise20170906 {
    public static void main(String[] args) {
        // variable scope
        {
            int var1 = 10;
            if (true) {
                int var2;
                var1 = 5;
                var2 = 20;
                System.out.println(var1);
                System.out.println(var2);
            }

            {
                // int var1; // compile error
                int var2 = 30;
            }
            var1 = 15;
            System.out.println(var1);
            // System.out.println(var2); //compile error

            int incX = 10;
            int incZ = ++incX;

            System.out.println("incZ = " + incZ);
            System.out.println("incX = " + incX++);
            System.out.println("incX = " + incX);
            System.out.println("incX = " + ++incX);

            boolean play = true;
            System.out.println(play);

            play = !play;
            System.out.println(play);

            play = !play;
            System.out.println(play);

            int v1 = 5;
            int v2 = 2;

            int result1 = v1 + v2;
            System.out.println("result1=" + result1);

            int result2 = v1 - v2;
            System.out.println("result2=" + result2);

            int result3 = v1 * v2;
            System.out.println("result3=" + result3);

            int result4 = v1 / v2;
            System.out.println("result4=" + result4);

            int result5 = v1 % v2;
            System.out.println("result5=" + result5);

            double result6 = (double) v1 / v2;
            System.out.println("result6=" + result6);

            int addAssign = 10;
            addAssign += 20;
            System.out.println("add and assign value is " + addAssign);
            addAssign = addAssign + 20;
            System.out.println("add and assign value is " + addAssign);

            int overflow1 = 2000000000;
            int overflow2 = 2000000000;
            long overflowResult = overflow1 + overflow2;
            System.out.println("overflow output is: " + overflowResult);

            long overflow3 = 2000000000L;
            long noOverflow = overflow1 + overflow3;
            System.out.println("no overflow output is: " + noOverflow);
            System.out.println("int value is " + (overflow1 / 100000) + " double value is: " + (overflow1 / 100000.0));

            // Compare operator
            int num1 = 10;
            int num2 = 10;
            boolean compareEq = (num1 == num2);
            boolean compareNotEq = (num1 != num2);
            boolean compareLessThan = (num1 <= num2);
            System.out.println("compareEq=" + compareEq);
            System.out.println("compareNotEq=" + compareNotEq);
            System.out.println("compareLessThan=" + compareLessThan);
        }
    }
}
