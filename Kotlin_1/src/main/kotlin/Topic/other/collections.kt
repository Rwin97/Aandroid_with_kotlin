package Topic.other


fun hashMap(){
    val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
    println (scientific.get("guppy"))
    println(scientific.get("zebra fish"))
//    println("scientific.get("swordtail"")
    println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
    println(scientific.getOrElse("swordtail") {"sorry, I don't know"})
}

fun listIterator(){
    val list2 = listOf("a", "bbb", "cc")
    for (s in list2.listIterator()) {
        print("$s ")
    }
}
fun list(){
    val list = listOf(1, 5, 3, 4)
    println(list.sum())
}

fun stringList(){
    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumBy { it.length })
}