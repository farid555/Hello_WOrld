import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
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

 */
        /////////////////****************//////////////////////

         /*
        String name = "Mohammad Farid Zaman";
        String job = "software developer";
        int age = 32;

        System.out.printf(String.valueOf(name.length()));
        System.out.printf(String.valueOf(name.isEmpty()));
        System.out.printf(String.valueOf(name.toUpperCase()));
        System.out.printf(String.format("Hello there! I am %s. I am a %s. I am %d years old.", name, job, age));
        System.out.printf("Hello there! I am " + name + ". I am a " + job + ".");
        System.out.printf("This is the copyright symbol:  " +  copyrightSymbol + name);
*/
        /////////////////****************//////////////////////
/*


        System.out.print("What is your name? \n");
        String nameInput = scanner.nextLine();

        System.out.printf("Hello %s!  How Old are you? \n" ,nameInput);
        int ageInput = Integer.parseInt(scanner.nextLine());
       // cleans up the input buffer


        System.out.printf("I am %d years old. \n", ageInput);


        System.out.print("What language you prefer for programming. \n");

        String langInput = scanner.nextLine();
        System.out.printf("I prefer %s for programming.", langInput);
*/

        //////////////////********> Conditional Statements <********//////////////////////
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number1:  ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the first number2:  ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();


        System.out.print("What operation do you want perform:  ");
        String operation = scanner.nextLine();

        if( operation.equals("sum")){
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        }else if( operation.equals("sub")){
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        }else if( operation.equals("div")){
            if(number2 == 0){
                System.out.print("Can not divide by zero");
            }else{
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
            }
        }else if( operation.equals("multi")){
            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        }else{
            System.out.printf("%s is not a supported operation", operation);
        }
*/
        //////////////////*******> Switch Cases <*********//////////////////////
/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number1:  ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the first number2:  ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();


        System.out.print("What operation do you want perform:  ");
        String operation = scanner.nextLine();

        switch (operation){
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "multi":
                System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
                break;
            case "div":
                if(number2 == 0){
                    System.out.print("Can not divide by zero");
                }else{
                    System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                }
                break;
            default:
                System.out.printf("%s is not supported operation.", operation);
        }

        scanner.close();

        */
        //////////////////*******> Arrays <*********//////////////////////

     char[] vowels = new char[5];

     vowels[0] = 'a';
     vowels[1] = 'e';
     vowels[2] = 'i';
     vowels[3] = 'o';
     vowels[4] = 'u';

        System.out.println(vowels[2]);
        System.out.println(Arrays.toString(vowels));

        char[] vow = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(Arrays.toString(vow));

    }
}

