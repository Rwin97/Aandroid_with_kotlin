package Topic.Conditionals

fun main(){
    getSemester(6)
}

fun result(value: Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print("Hi")
    }
}

/**
 * Compact Functions
 * */
fun getSemester(month: Int) = when(month){
        in 1..6 -> "First semester"
        in 7..12 -> "Second semester"
        !in 1..12 -> "Invalid semester"
        else -> "other"
    }
fun getTrimester(month: Int){
    when(month){
        1, 2, 3 -> println("First trimester")
        4, 5, 6 -> println("Second trimester")
        7, 8, 9 -> println("Third trimester")
        10, 11, 12 -> println("Fourth trimester")
        else -> println("Invalid trimester")
    }
}

fun getMonth(month: Int){
    when(month){
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("Invalid month")
    }
}