package Topic.Functions

fun main() {
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    println(updateDirty(15, ::increaseDirty))

    dirtyLevel()
}

fun lambda() {
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))
}

fun lambdaValuesWithFunctions() {
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
}

/**
 * Lambda with functions od superior orders
 * */

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty(start: Int) = start + 1

/**
 * Parameter which is function as last parameter
 * */
fun dirtyLevel() {
    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23 }
    println(dirtyLevel)
}