
public class Variable {
    public static void main(String[] args) {
        // variable basic example
        int value = 10;
        int result = value + 10;
        System.out.println(result);

        // byte example
        byte byte1 = -128;
        byte byte2 = 127;

        // byte byte3 = 128; //compile error
        System.out.println(byte1);
        System.out.println(byte2);

        // char example
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        char c5 = 44032;
        char c6 = '\uac00';
        int uniCode = c1;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(uniCode);

        // int example
        int int1 = 10; // Decimal
        int int2 = 012; // Octal
        int int3 = 0xA; // Hexa-decimal
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
        long long1 = 1000000000000L;
        // long long2 = 1000000000000; //compile error
        System.out.println(long1);

        double double1 = 3.14;
        // float var2 = 3.14; // 컴파일 에러(Type mismatch)
        float float1 = 3.14F;
        System.out.println("double1: " + double1 + " float1: " + float1);

        float floatExpNotation = 3e6F;
        double doubleExpNotation = 2e-3;
        System.out.println("floatExpNotation: " + floatExpNotation + " doubleExpNotation: " + doubleExpNotation);

        // boolean example
        boolean t = true;
        boolean f = false;
        System.out.println("boolean true is " + t + " boolean false is " + f);
    }
}
