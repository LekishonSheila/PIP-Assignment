fun main() {
   student("Sheila",20,"Kenya")
    var sum = addition(20,10,5,15)
    println(sum)

    var average = averageNumbers(20.0,2.5,15.5,20.5,30.5)
    println(average)


    val person = Person(
        fullName = "Lekishon Sheila",
        age = 20,
        phoneNumber = "+24706119709",
        email = "lekishonsheila@gmail.com",
        weightInKg = 60.2,
        isUgandan = true
    )
    println(person.fullName)
    println(person.age)
    println(  person.phoneNumber)
    println(person.weightInKg)
    println(person.isUgandan)





}
// Create and invoke a function that takes in a users name,
// age, and nationality and prints out “Hello my name is
// ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my
// name is Lucy, I am 23 years old and I am from Kenya”
fun student(userName:String,age:Int,nationality:String){
    println("Hello my name is $userName,I am $age years old and I am from $nationality")

}

//Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    return num1+num2+num3+num4

}

//Create and invoke a function that given any 5 numbers, it returns their average
fun averageNumbers(num1:Double,num2:Double,num3:Double,num4:Double,num5:Double):Double{
    return(num1+num2+num3+num4+num5)/5

}

//You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
data class Person(
    val fullName: String,
    val age: Int,
    val phoneNumber: String,
    val email: String,
    val weightInKg: Double,
    val isUgandan: Boolean
)

