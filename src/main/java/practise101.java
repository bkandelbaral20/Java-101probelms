
//java practise 101 challenges

import java.util.ArrayList;

public class practise101 {

//  * Exercise 001 - Add Ints
//  * Write a method to add to integers (int) and return the sum.

    public static int addInt(int a, int b){
        return a+b;
    }

//* Exercise 002 - Say Hello
// * Given an input String, name; return a String with "Hello " appended in-front of name and "!" appended after name.

    public static String sayHello( String name){
        return "! " + name + " !";
    }

//    Exercise 004 - Add doubles
//     * Write a method to add to real numbers (double) and return the sum as a double.

    public static double addDoubles(double a , double b){
        return (a*a + b*b);
    }

   // * Exercise 005 - Concatenate strings
    // * Write a method to join to Strings together with a space between the two Strings.

    public static String concatenateString(String a, String b){
        return a + " " + b;
    }

// *Exercise 006 - is Equal
//     * Write a method that accepts two integers and returns the boolean value true if they are equal and returns the
//     * boolean value false if the are not equal.

    public static boolean isEqual(int a, int b){
        return a == b;
    }

//    * Exercise 007 - is Greater Than
//     * Write a method that accepts two doubles and returns the boolean value true if a is greater than b and returns
//     * the boolean value false if a is not greater than b.

    public static boolean isGreaterThan(double a, double b){
        return a>b;
    }

//    * Exercise 008 - Cubed
//     * Write a method that accepts a double and returns the number cubed ( times itself three times).
    public static double cubed(double num){
        return num*num*num;
    }

//    * Exercise 009 - Positive Difference
//     * Write a method that accepts two integers and returns the positive difference between the two numbers.

    public static int positiveDifference(int a, int b){
        return Math.abs(a)- Math.abs(b);
    }

//    * Exercise 010 - Remainder
//     * Write a method that accepts two integers and returns the remainder from the division .

    public static int remainder( int a, int b){
        return a / b;
    }

//    * Exercise 011 - Preform Indicate Operation
//     * Write a method with 3 parameters; a String and 2 doubles. The string will be an operation that the operation
//     * needs to process on the two operands. Return the result if the operation. Return 0.0 if the operation is not
//     * one of the four specified. The operation should be case sensitive.

    public static double IndicateOperation(String operation, double a, double b){
        switch (operation) {
            case ("ADD"):
                return a + b;
            case ("SUB"):
                return a - b;
            case ("MUL"):
                return a * b;
            case ("DIV"):
                return a / b;
            default:
        }
        return 0;
    }

//     * Exercise 012 - Find Factors
//     * Find all of the factors for a given positive integer (int). The result needs to be sorted in ascending order.

public static ArrayList<Integer> findFactors(int num){
    ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i<= num; i++ ){
            if(num % i==0){
                numbers.add(i);
            }
        }
        return numbers;
}

//Printing out the answer for checking inside the main method

    public static void main(String[] args) {
        System.out.println(addInt(2,5));
        System.out.println(sayHello("Binjita"));
        System.out.println(addDoubles(1,2));
        System.out.println(concatenateString("hello", "there"));
        System.out.println(isEqual(2,3));
        System.out.println(isGreaterThan(3,2));
        System.out.println(cubed(2));
        System.out.println(remainder(2,4));
        System.out.println(IndicateOperation("sum",1,3));
        System.out.println(findFactors(4));
    }

}
