package Topic.Functions

fun main() {
    myName()
    myAge2()
    add(5, 5)
    val mySubtract = subtract(10, 5)
    println(mySubtract)
}

/**
 * Functions
 * */
fun myName(){
    println("My name is Erwin")
}

/**
 * Functions with input variables
 * */

fun myAge(age: Int){
    println("My age is $age")
}
/**
 * predetermined values
 * */
fun myAge2(age: Int = 25){
    println("My age is $age")
}
fun add(num1: Int, num2: Int){
    println(num1 + num2)
}

/**
 * Defaults(Predetermined values) can also be functions
 * fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {}
 * fun getDirtySensorReading(){}
 * */


/**
 * Functions with input variables and output variables
 * */

fun subtract(num1: Int, num2: Int): Int{
    return num1 - num2
}

/**
 * For small functions
 * */
fun subtract2(num1: Int, num2: Int) = num1 - num2




/**
 * Variables convert to normal functions
 * */
fun numericVariables() {
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
}

fun booleanVariables() {

    /**
     * Boolean Variables
     * write variable names in camelCase
     * camelCase example nameExample
     */

    // Bolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3: Boolean = false
}

fun alphanumericVariables() {
    /**
     * Alphanumeric Variables
     * write variable names in camelCase
     * camelCase example nameExample
     */

    // Char
    val charExample1: Char = 'a'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    // String
    val stringExample = "Hello world from String"
    val stringExample2 = "2"
    val stringExample3 = "4"
    println("concat: ${stringExample2 + stringExample3} ")
    println("convert to int: ${stringExample2.toInt() + stringExample3.toInt()} ")
}

