package Topic.other

open class ExtensionFunctions(val color: String, private val size: Int) {
//    fun ExtensionFunctions.isRed() = color == "red"    // OK
//    fun ExtensionFunctions.isBig() = size > 50         // gives error

}

class GreenLeafyPlant(size: Int) : ExtensionFunctions("green", size) {

    fun ExtensionFunctions.print() = println("AquariumPlant")
    fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

    val ExtensionFunctions.isGreen: Boolean
        get() = color == "green"

    fun ExtensionFunctions?.pull() {
        this?.apply {
            println("removing $this")
        }
    }
}



// large Version
//fun String.hasSpaces(): Boolean {
//    val found = this.indexOf(' ')
//    // also valid: this.indexOf(" ")
//    // returns positive number index in String or -1 if not found
//    return found != -1
//}

// short version
fun String.hasSpaces() = indexOf(" ") != -1