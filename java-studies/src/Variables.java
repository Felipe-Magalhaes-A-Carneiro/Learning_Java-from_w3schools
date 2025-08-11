public class Variables {
    // They are containers for storing data values.
    
    // String - stores text. Values are surrounded by double quotas.
    // int - stores integers (whole numbers), without decimals.
    // float - stores floating points numbers, with decimals, such as 19.99 or 0.05
    // char - stores singles characters, such as 'a' or 'Z'. Values are surrounded by single quotes
    // boolean - stores values with two states: true or false

    // CREATING VARIABLES -
    /* To create variables in Java, you need to:
     * 
     * - Choose a type (like int or String)
     * - Give the variable a name (like x, age, or name)
     * - Opionally assing it a value using =
     
        SYNTAX - 

        'type variableName = value;'


     */

    String name = "Felipe";
    System.out.println(name);

    int myNum; // declaring a variable without assinging the value
    myNum = 32; 
    myNum = 33; // myNum was 32, but now is 33
    System.out.println(myNum);

    flaot myFloatNum = 9.99f/

    char myLetter = 'F';

    boolean myBool = true;

    // FINAL/ CONSTANT VARIABLES
    /* If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only): */

    final String myCountry = "Brazil";
}
