package Topic.Variables


fun main(){
    /**
     * Numeric Variables
     * write variable names in camelCase
     * camelCase example nameExample
     */
   // Int -2,147,483,647 - 2,147,483,647
    val age: Int = 10

    // Long -9,223,372,036,854,775,807 - 9,223,372,036,854,775,807
    val example: Long = 30

    // Float
    val floatExample: Float = 30.5f

    // Double
    val doubleExample: Double = 3241.13212132

    /**
     * Alphanumeric Variables
     * write variable names in camelCase
     * camelCase example nameExample
     */

    // Char
    val charExample1:Char = 'a'
    val charExample2:Char = '2'
    val charExample3:Char = '@'

    // String
    val stringExample = "Hello world from String"
    val stringExample2 = "2"
    val stringExample3 = "4"
//    println("concat: ${stringExample2 + stringExample3} ")
//    println("convert to int: ${stringExample2.toInt() + stringExample3.toInt()} ")

    /**
     * Boolean Variables
     * write variable names in camelCase
     * camelCase example nameExample
     */

    // Bolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3: Boolean = false

    /**
     * Inmutable Variables
     * Immutable variables cannot be assigned
     * val
     */
    val age2: Int = 10

    /**
     * Mutable Variables
     * Mutable variables can be reassigned
     * var
     */
    var age3: Int = 10
    age3 = 20
//    println(age3)

    /**
     * Simple Excercise
     */

    // Addition
//    println("Addition: ${age + age3}")

    // Subtraction
//    println("Subtraction: ${age3 - age}")
    // Multiplication
//    println("Multiplication: ${age * age3}")
    // Division
//    println("Division: ${ age3 / age }")
    // Mod
//    println("Mod: ${ age3 % age }")

    var exampleAdd: Float = age + floatExample
//    println(exampleAdd)

    var exampleAdd2: Int = age + floatExample.toInt()
//    println(exampleAdd2)
}