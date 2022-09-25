package objectexpression

fun main() {
    val objectInt = object{
        val name = "Manish"
        val lastName = "Singh"
        override fun toString(): String {
            return "$name $lastName"
        }

        fun helloWorld(): String{
            return "Hey $name $lastName, How are you?"
        }
    }
    println(objectInt.toString())
    println(objectInt.helloWorld())
}