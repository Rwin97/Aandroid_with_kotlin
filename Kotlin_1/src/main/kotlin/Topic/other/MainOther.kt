package Topic.other

fun main(){
    extensionFunction()
}

fun hashMaps(){
    extensionFunction()
}

fun extensionFunction(){
//    val plant = GreenLeafyPlant(size = 10)
//    plant.print()
    println("\n")

//    val aquariumPlant: ExtensionFunctions = plant
//    aquariumPlant.print()

//    aquariumPlant.isGreen

//    val plant: AquariumPlant? = null
//    plant.pull()
}
fun collections(){
//    list()
//    stringList()
    listIterator()
}
fun companionObject(){
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")
}

fun pairsTriple(){
    var pairs = PairsAndTriples()
    pairs.pair()
    pairs.triple()
    pairs.pairToPair()
    pairs.destroypairs()
    pairs.destroyTriple()
}