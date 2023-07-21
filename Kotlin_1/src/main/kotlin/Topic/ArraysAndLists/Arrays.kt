package Topic.ArraysAndLists

fun arrays(){

    // Size
    // range 0-6
    val weekDays = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    println(weekDays[6])
//    println(weekDays.size)

    // loops for arrays
    for (value in weekDays){
//        print("$value ")
    }

    for (position in weekDays.indices){
        println("$position ")
    }

    for ((position,  value) in weekDays.withIndex()){
        println("$position -> $value ")
    }

    val example = weekDays.filter { it.contains("S") }
    println(example)
}