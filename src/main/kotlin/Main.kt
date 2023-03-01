fun main() {
   var person1=Human("Anna",20,50)
   var foodWeight=5
    println("I am eating $foodWeight kgs of food")
    person1.increment(5)
    println(person1.weight)



    println("My speech")

  person1.increase(1)
    println(person1.age)

    //Data class
    val myDetails=Details("Mary","Wago",
        "wagomary@gmail.com",+254711325678,5050)
    println(myDetails.email)
    println(myDetails.firstName)


}
class Human(var name:String,var age:Int,var weight:Int) {
   fun eat(foodWeight:Int):Int{
       return foodWeight

   }
    fun increment(incremention: Int):Int{
        weight+=incremention
        return weight
    }
    fun speak(speech: String):String{
        return speech
    }
    fun increase(incremention:Int):Int{
        age+=incremention
        return age

    }



}

//Data class
data class Details(var firstName:String,var lastname:String,var email:String,
                   var phoneNumber:Long,var password:Int)
