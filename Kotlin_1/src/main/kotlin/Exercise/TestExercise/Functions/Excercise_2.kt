package Exercise.TestExercise.Functions

class Excercise_2 {
    fun positivem_negative_zero(){
        println("Enter a integer number: ")
        val number = readLine()?.toInt()

        if (number != null){
            if (number > 0){
                println("The number is prositivem")
            }else if (number < 0){
                println("The numeber is negative")
            }else{
                println("The number is equal to zero")
            }
        }
    }
}