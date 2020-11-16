
//java practise 101 challenges

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






//Printing out the answer for checking inside the main method

    public static void main(String[] args) {
        System.out.println(addInt(2,5));
        System.out.println(sayHello("Binjita"));
        System.out.println(addDoubles(1,2));
        System.out.println(concatenateString("hello", "there"));
    }

}
