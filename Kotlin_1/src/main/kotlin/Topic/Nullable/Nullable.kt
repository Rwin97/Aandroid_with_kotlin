package Topic.Nullable

fun main(){
    var name: String? = "null"
    println(name?.get(3)?: "It is null")
}