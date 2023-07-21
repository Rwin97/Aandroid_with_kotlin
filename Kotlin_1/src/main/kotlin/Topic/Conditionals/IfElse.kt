package Topic.Conditionals

fun main(){
    ifMultipleConditionOr()
}

fun ifMultipleConditionOr(){
    var pet = "cat"
    if (pet == "dog" || pet == "cat"){
        print("It's a cat or dog")
    }
}
fun ifMultipleConditionAnd(){
    var age: Int = 18
    var parentPermission = false
    var imHappy = true
    if (age >= 18 && parentPermission && imHappy){
        println("I can drink beer")
    }
}
fun ifInt(){
    var age: Int = 18
    if (age >= 18){
        println("Drink beer")
    }else{
        println("Drink juice")
    }
}
fun ifBoolean(){
    var iAmHappy = false

    if (!iAmHappy){
        println("I am sad")
    } else {
        println("I am happy")
    }
}

fun ifNested(){
    val animal: String = "cat"
    if (animal == "dog"){
        println("It's a dog")
    } else if (animal == "cat"){
        println("It's a cat")
    } else if (animal == "bird"){
        println("It's a bird")
    } else {
        println("It is none of the expected animals")
    }
}

/**
 * if basic
 * */
fun ifBasic(){
    val name = "Pepe"

    if(name == "Pepe"){
        println("Hey, The name variable is Chema")
    } else {
        println("This is not Pepe")
    }
}