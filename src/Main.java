import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------- Character --------");
        System.out.println(character());
        System.out.println("-------- Purse Credits --------");
        System.out.println(operations());
        System.out.println("-------- Lightsaber --------");
        System.out.println(lightsaber("black", "purple"));
        System.out.println(lightsaber("grey", "purple"));
        System.out.println(lightsaber("black", "green"));
        System.out.println(lightsaber("green", "yellow"));
        System.out.println("-------- Ship --------");
        System.out.println(ship("Millennium Falcon"));
        System.out.println(ship("Death Star"));
        System.out.println("-------- Order --------");
        System.out.println(order(4, true));
        System.out.println(order(6, true));
        System.out.println(order(4, false));
        System.out.println(order(6, false));
        System.out.println("-------- Drink --------");
        System.out.println(drink(.5f, 25));
        System.out.println(drink(2, 25));
        System.out.println(drink(.5f, 22));
        System.out.println(drink(2, 22));
        System.out.println("-------- FizzBuzz --------");
        FizzBuzz.fizzBuzz100();
        System.out.println("-------- FizzBuzz Switch--------");
        FizzBuzz2.fizzBuzz100();
        System.out.println("-------- Hello World --------");
        helloWorld();
        System.out.println("-------- Greeting --------");
        greeting("Laura");
        System.out.println("-------- Add --------");
        System.out.println(add(2, 4));
        System.out.println("-------- Fave Color Finder --------");
        faveColorFinder("purple");
        faveColorFinder("red");
        faveColorFinder("black");
        faveColorFinder("green");
        System.out.println("-------- That's Odd --------");
        thatsOdd(4);
        thatsOdd(5);
        System.out.println("-------- Big or Small Array --------");
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(102d);
        arr.add(98d);
        arr.add(100d);
        System.out.println(bigOrSmall(arr));
    }

    /* -------------------- Part 1 - Variables & Data Types -------------------- */

    public static String character() {
        String firstName = "Han", lastName = "Solo", birthYear = "32 BBY", homeWorld = "Corellia";
        float height = 1.8f; // in meters
        float weight = 80; // in kilograms
        String output = String.format("Name: %s %s, Born: %s on %s, Height: %1.1f meters, Weight %1.0f kilograms", firstName, lastName, birthYear, homeWorld, height, weight);
        return output;
    }

    /* -------------------- Part Two - Mathematical Operators -------------------- */
    public static double operations() {
        double purse = 150.0;
        /* You walk into Mubo’s Droid Depot to buy a droid. The cost is 24.3. */
        purse -= 24.3;
        /* Next, you walk into Dok-Ondar’s Den of Antiquities. You purchase a very fine set of boots that cost you a flat 45 credits. */
        purse -= 45;
        /* As you move around in the Black Spire Outpost you hear some noise down an alley. A group of Jedi are playing dice. You play a few rounds and double the credits in your purse. */
        purse *= 2;
        /* With your purse bursting at the seams you walk into Savi’s Lightsabers. You inquire about a rare lightsabre, and the cashier says he will give it to you for one tenth of all the credits in your pocket. */
        purse -= (purse *= .1);
        // final purse;
        return purse;
    }

    /* -------------------- Part Three - Conditional Love -------------------- */

    public static String lightsaber(String handle, String blade) {
        if (handle == "black" && blade == "purple")
            return "This one's mine!";
        else
            return "Pass";
    }

    public static String ship(String shipName) {
        if (shipName.equals("Millennium Falcon"))
            return "let's go";
        else
            return "I better hide somewhere";
    }

    public static String order(float price, boolean recommended) {
        if (price < 5 && recommended == true)
            return "I'll try it";
        else
            return "I'd rather not";
    }

    public static String drink(float price, float size) {
        if (price < 1 || size > 24)
            return "I'll order it";
        else
            return "I'll skip this one";
    }

    /* -------------------- Part Four - FizzBuzz Deep Dive -------------------- */

    public class FizzBuzz {                                  // naming the class that will hold the method

        public static void fizzBuzz100() {                 // creating a new method that does not require output <---bug is that the function cannot be void?
            for (int i = 1; i <= 100; i++) {                // starting a for-loop to loop through the indexes of the argument starting at 1
                if (((i % 5) == 0) && ((i % 3) == 0))       // starting an if statement; if the current index is divisible by 3 then... (next line)
                    System.out.println("fizzbuzz");             // print "fizz"
                else if ((i % 5) == 0)                      // else if the current index is divisible by 5 then... (next line)
                    System.out.println("buzz");             // print "buzz"
                else if ((i % 3) == 0)                      // else if the current index is divisible by 3 AND 5 then... (next line)
                    System.out.println("fizz");         // print "fizzbuzz"
                else                                        // all other data not meeting the above criteria then... (next line)
                    System.out.println(i);                  // print the index
            }
        }
    }

    class FizzBuzz2 {

         public static void main(String[] args) {
             fizzBuzz100();
         }

         private static void fizzBuzz100() {
             for (int i = 1; i <= 100; i++) {
                 int switchVal = ((i % 3) == 0 ? 0 : 1) + ((i % 5) == 0 ? 0 : 2);
                 switch (switchVal) {
                     case 0:
                         System.out.println("fizzbuzz");
                         break;
                     case 1:
                         System.out.println("buzz");
                         break;
                     case 2:
                         System.out.println("fizz");
                         break;
                     case 3:
                         System.out.println(i);
                         break;
                 }
             }
         }
    }

        /* -------------------- Part 5 - Functions -------------------- */

        // /* Create a function called helloWorld that simply logs Hello, World!. */

        public static void helloWorld() {
            System.out.println("Hello, World!");
        }

        // /* Create a function called greeting that takes in a person’s name as an argument and logs Hello, {name}, with {name} being the argument passed into the function. */

        public static void greeting(String name) {
            System.out.println("Hello, " + name);
        }

        // /* Create a function called add that takes in two parameters (both of these will be numbers)
        // The add function should RETURN the two parameters added together. */

        public static float add(float num1, float num2) {
            return num1 + num2;
        }

        // /* Write a function called faveColorFinder that takes in one parameter called color (which will be a string).
        // If the passed in color equals ‘red’, return ‘red is a great color’
        // If the passed in color equals ‘green’, return ‘green is a solid favorite color’
        // If the passed in color equals ‘black’, return ‘so trendy’
        // Otherwise, you should return the string ‘you need to evaluate your favorite color choice’ */

         public static void faveColorFinder(String color) {

             switch (color) {
                 case "red":
                     System.out.println("red is a great color");
                     break;
                 case "green":
                     System.out.println("green is a solid favorite color");
                     break;
                 case "black":
                     System.out.println("so trendy");
                     break;
                 default:
                     System.out.println("you need to evaluate your favorite color choice");
             }
         }


        // /* Create a function called thatsOdd that takes in a single argument (a number).
        // Using conditional logic, if the number is even, return ‘That’s not odd!’
        // Otherwise, return ‘That is odd indeed!’ */

        public static void thatsOdd(float num) {
            if (num % 2 == 0)
                System.out.println("That's not odd");
            else
                System.out.println("That is odd indeed!");
        }


    /* Create a function called ‘bigOrSmall’ that takes in one parameter, ‘arr’, which will be an array of numbers.
        Inside of the bigOrSmall function, create a new array called ‘answers’.
        Then, loop over the passed in arr parameter, and check to see if the number in the array is - GREATER than 100.
        If it is, push ‘big’ as a string to the answers array.
        If the number is LESS than or EQUAL to 100, push ‘small’ as a string to the answers array.
        Return the answers array inside of the function.  */


         public static ArrayList<String> bigOrSmall(ArrayList<Double> arr) {
             ArrayList<String> answers = new ArrayList<>();
             for (int i = 0; i < arr.size(); i++) {
                 if(arr.get(i) > 100)
                     answers.add("big");
                 else
                     answers.add("small");
             }
             return answers;
         }
    }

