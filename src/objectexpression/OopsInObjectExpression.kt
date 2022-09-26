package objectexpression

import java.util.*

open class User(){
    open val userName: String = "Rotash"
    open val lastName: String = "Singh"

   open fun printUserDetails(){
        println("UserName = $userName $lastName")
        println("UserAge = 28 years")
        println("UserDOB = 12/oct/1994")
    }
}

fun main(args: Array<String>) {
    val modifyUserObjects = object: User(){
        override fun printUserDetails() {
            super.printUserDetails()
            println("Plus Subcription User")
        }
    }
    modifyUserObjects.printUserDetails()
}