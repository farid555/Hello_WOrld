
public class Main {
    public static void main(String[] args) {

        // integer types
        byte aSingleByte = 100; // -128 to 127
        short sSmallNumber = 20000; // -32,768 to 32,767
        int anInteger = 2147483647; // - 2147483647 to 2147483647
        long aLargeNumber = 9223372036854775807L;  // -9223372036854775807L to 9223372036854775807L

        // decimal types
        double aDouble = 1.79769313; // 4.9E-324 to 1.7976931348623157E308
        float aFloat = 3.4028F; // 1.4E to 3.4028235E38

        // booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

        // Characters
        char copyrightSymbol = '\u00A9';


        System.out.printf("This is the copyright symbol:  " +  copyrightSymbol );
    }
}

