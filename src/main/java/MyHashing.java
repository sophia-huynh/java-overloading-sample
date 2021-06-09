/*
 * Instructions for completing MyHashing.java
 *
 * As you go, make sure to run the provided tests in test/MyHashingTest.java
 *
 * HINT 0: Take the time to hover over any red squiggles in your files, as
 *         IntelliJ will often suggest ways to fix any errors. Make sure to
 *         carefully read what it tells you though, as it won't always be
 *         suggesting what you actually want to do to fix the problem.
 *
 * 1. Add two constructors to the MyHashing class:
 *    - an empty constructor.
 *    - a constructor that takes one int as an input and
 *      initializes the seed instance attribute to the value
 *      of the input parameter.
 *
 * 2. Add an instance method called hash so that:
 *    - if it takes an int as its argument, it stores the input value in seed
 *      and returns the previous value of seed.
 *    - if it takes a char as its argument, it stores the input value in seed
 *      and returns the sum of the previous value of the seed
 *      and its new value - modulo the class attribute MODULO.
 *      HINT 1: If you use a char as an operand to the addition operator or in
 *              an assignment statement, Java will do what you want it to do.
 *
 * 3. Add a class method called hash so that:
 *    - if it takes a String as its argument, it returns the sum of
 *      the ASCII values of the characters in the String.
 *      HINT 2: You may want to look at the documentation for class String and,
 *              in particular, the toCharArray method.
 */

public class MyHashing {
    private int seed;
    public static final int MODULO = 42;
    
    /* TODO: ADD YOUR CODE HERE */

}
