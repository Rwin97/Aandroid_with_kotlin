package Exercise.ExcerciseOther

/**
 * Temperature converter
 * There are three main temperature scales used in the world: Celsius, Fahrenheit, and Kelvin.
 *
 * In the initial code provided in the following code snippet, write a program that converts a temperature from one scale to another with these formulas:
 *
 * Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
 * Kelvin to Celsius: ° C = K - 273.15
 * Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15
 * Note that the String.format("%.2f", /* measurement */ ) method is used to convert a number into a String type with 2 decimal places.
 * */
fun main() {

    //lambda functions
    val celsiusToFahrenheit: (Double) -> Double = {celsius -> celsius*9/5+32}
    // Fill in the code.
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celsiusToFahrenheit )

    //lambda functions
    val kelvinToCelsius: (Double) -> Double = {kelvin -> kelvin - 273.15}
    // Fill in the code.
    printFinalTemperature(350.0, "kelvin", "Celsius", kelvinToCelsius )

    //lambda functions
    val fahrenheitToKelvin: (Double) -> Double = {fahrenheit -> (fahrenheit - 32)*5/9 + 273.15}
    // Fill in the code.
    printFinalTemperature(10.0, "Fahrenheit", "kelvin", fahrenheitToKelvin )

    // other Solutions
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}