package objectexpression

open class InterFaceImplimentation {

}

interface A {
    fun print()
}

fun main() {
val objectType= object : A,InterFaceImplimentation(){
    override fun print() {
        print("print mathode is called")
    }

}
}