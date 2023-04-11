class  task2(val FirstName : String , val LastName : String , var age : Int , var salary : Int ,) {
    fun salarycheck(): Boolean {
        if (salary>=1000) {
            return true
        }
        else {
            return false
        }
    }
    fun doc1() {
        println("$FirstName $LastName is $age")
    }
}
fun main() {
    var name= task2("Fateme", "Rezvani", 24, 900)
    println(name.salarycheck())
    name.doc1()
}