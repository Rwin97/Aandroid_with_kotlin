package Exercise.TestExercise.Functions

class Excercise_1 {
    fun exercise_1() {
        println("Enter your name: ")
        val name = readLine()

        println("Enter your age: ")
        val age = readLine()?.toInt()

        println("Your name is: $name")
        println("Your age is: $age")
    }
}