package Topic.ArraysAndLists

fun inmutablelist(){
    val readOnly: List<String> = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    println(readOnly.size)
//    println(readOnly[0])
//    println(readOnly.first())
//    println(readOnly.last())

    // filters
//    val example = readOnly.filter { it.contains("S") }
//    println(example)

    readOnly.forEach { weekDay -> println(weekDay) }
}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    weekDays.add("New day")
    weekDays.add(3,"New day")
    println(weekDays)

//    if (weekDays.isEmpty()){
//
//    } else {
//        weekDays.forEach{ println(it) }
//    }

    if (weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }
}