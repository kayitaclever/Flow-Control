fun main() {
    oddNumbers()
    println(arr1(arrayOf("LASILA","MUTSI","mukamana","nakakande")))
    ageclassifier(34)
    ageclassifier(4)
    ageclassifier(13)
    integers()

}


//Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun oddNumbers(){

    for (num in 1 ..100){
        if (num%2!=0)


        println(num)}
    }
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)

fun arr1(Names: Array<String>):Int {

    var y = 0
    for (x in Names){
        if (x.length>5){
            y++
        }
    }
            return y
}


//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)


fun ageclassifier(age:Int){

    if (age<6){
    println("Milk")

}
    else if (age in 7..14){
    println("Fanta")
     }

    else {
        println("Coca cola")
     }

     }

//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)

fun integers(){
    for(x in 1..100){
        if (x%3==0){
            println(" Fizz")

        }

        else if (x%5==0){
            println("buzz")

        }
        else  if  (x%3==0 && x%5==0){
            println("fizzbuzz")
        }

    }


}


