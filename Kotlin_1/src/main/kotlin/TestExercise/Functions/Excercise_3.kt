package TestExercise.Functions

class Excercise_3 {
    fun area(){
        println("Enter a base: ")
        val base = readln().toInt()
        println("Enter a height: ")
        val height = readln().toInt()

        val result = base * height
        println("The area is: $result")
    }
}