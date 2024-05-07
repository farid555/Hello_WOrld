import java.time.LocalDate;
import java.util.*;

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
        System.out.printf(String.format("Hello there! I am %s. I am an %s. I am %d years old.", name, job, age));
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


        System.out.print("What operation do you want to perform:  ");
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


        System.out.print("What operation do you want to perform:  ");
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
/*
     char[] vowels = new char[5];

     vowels[0] = 'a';
     vowels[1] = 'e';
     vowels[2] = 'i';
     vowels[3] = 'o';
     vowels[4] = 'u';

        //System.out.println(vowels[2]);
        //System.out.println(Arrays.toString(vowels));

        char[] vow = { 'o', 'i','a', 'e', 'u'};


        Arrays.sort(vow);
        System.out.println(Arrays.toString(vow));

        //System.out.println(vow.length);
*/

        //////////////////*******> Arrays <*********//////////////////////
/*
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};

        int sum = 0;

        for(int index = 0; index < numbers.length; index++) {

            sum += numbers[index];
            System.out.println(numbers[index]);
        }
        System.out.printf(String.valueOf(sum));

        */
/*
        int number = 5;
        for( int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.printf("%d * %d = %d \n", number, multiplier, number* multiplier);

        }

 */
        /*
         for( int number = 1; number <= 10; number++) {
             for( int multiplier = 1; multiplier <= 10; multiplier++) {
                 System.out.printf("%d * %d = %d \n", number, multiplier, number* multiplier);

             }
         }

         */

        //////////////////*******> While loop <*********//////////////////////
/*
        int number =  5;
        int multiplier = 1;

        while (multiplier <= 10){
            System.out.printf("%d X %d = %d  \n", number, multiplier, number* multiplier);
            multiplier++;
        }


        do{
            System.out.printf("%d X %d = %d  \n", number, multiplier, number* multiplier);
            multiplier++;
        } while (multiplier <= 10);
*/



        //////////////////*******> ArrayList <*********//////////////////////
         /*
        ArrayList<Integer> numbers = new ArrayList<Integer>();


        numbers.add(1);  //0 Index
        numbers.add(4);  //1
        numbers.add(15); //2
        numbers.add(23); //3
        numbers.add(24); //4
        numbers.add(25); //5

        System.out.println("before" + numbers.toString());
        */
        /*
        numbers.forEach( number -> {
            System.out.println(number * 2);
        });
        */

        /*
        numbers.forEach( number -> {
           numbers.set(numbers.indexOf(number), number * 2);
        });



        System.out.println("after" + numbers.toString());

        /*
        numbers.set(3, 30);  // By Index Set value
        numbers.remove(2); // Remove by Index
        numbers.remove(Integer.valueOf(4)); // Remove by value
       // numbers.sort(Comparator.naturalOrder());
        numbers.sort(Comparator.reverseOrder());


        System.out.println(numbers.get(3));
        System.out.println(numbers.toString());
        System.out.println(numbers.contains(1));
        System.out.println(numbers.size());

        */

        //////////////////*******> Hashmap <*********//////////////////////
/*
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);

        // examScores.replace("Math", 65);

        // examScores.clear();
        // examScores.remove("Math");

        examScores.forEach((subject, score) -> {
            System.out.println(subject + " - " + score);
        });

        // System.out.println(examScores.toString());
        // System.out.println(examScores.size());
        // System.out.println(examScores.get("English"));
        // System.out.println(examScores.containsValue(95));

*/
        //////////////////*******> Object Oriented Programming <*********//////////////////////
/*
        User youngerUser = new User();

        youngerUser.name = "Mohammad Farid Uzzaman";
        youngerUser.birthDay = LocalDate.parse("2015-01-31");


        User olderUser = new User();

        olderUser.name = "Zaman";
        olderUser.birthDay = LocalDate.parse("1975-01-23");

        System.out.printf("%s was born back in %s, and he is now %d years old. \n", youngerUser.name, youngerUser.birthDay.toString(), youngerUser.age());

        System.out.printf("%s was born back in %s, and he is now %d years old .", olderUser.name, olderUser.birthDay.toString(), olderUser.age());

        */

        User user = new User("Mohammad Farid Uzzaman","2015-01-31");

        Book book = new Book("Harry Potter", "J.K. Rowling");

        user.borrow(book);

        System.out.printf("%s was born back in %s, and he is now %d years old. \n", user.getName(), user.getBirthDay(), user.age());

        System.out.printf("%s has borrow these books: %s \n", user.getName(), user.borrowBooks());

    }
}

