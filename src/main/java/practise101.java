
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

//     * Exercise 013 - Get Nearest Integer to Real Sum
//     * Given a two double parameters, return the nearest integer sum. If a number is half-way between to integers,
//     * round up for positive sums and down for negative sums.

//    public static int getNearestIntegerToRealSum(double firstRealAddend, double secondRealAddend ) {
//
//        return 0;
//    }


//     * Exercise 014 - Is it a number
//     * Given a string s, write a method (function) that will return true if its a valid single integer or floating
//     * point number or false if its not.

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

//    * Exercise 015 - Find Two Addends
//     * Given a primitive array of integers a number n, return whether any two numbers from the array add up to equal n.
//     * For example, given [7, 15, 3, 6, 8] and n equal to 13, return true since 7 + 6 is 13.

    public static boolean twoAddend(int[] nums, int num){
        //checks the nums
        if(nums == null || nums.length < 2){
            return false;
        }
        //now find the sums using for loop
        for(int i=0; i< nums.length;i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == num){
                    return true;
                }
            }
        }
        return false;
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
        System.out.println(IndicateOperation("SUM",1,3));
        System.out.println(findFactors(4));
        System.out.println(isNumeric("3-5"));
//        System.out.println(twoAddend([7,15,3,6,8], 13 ));
    }

}
