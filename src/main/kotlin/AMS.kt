import java.util.Random
import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}!")
    // every function return value
    // return "type unit" == no value
    var (hi, food) = dayOfWeek()
    feedtheFish(hi, food)
    println(swim( food, ex2 = "ft"))
    println(canAddFish(10.0, listOf(3,3,3))) //---> false
    println(canAddFish(8.0, listOf(2,2,2), hasdecorate = false))// ---> true
    println(canAddFish(9.0, listOf(1,1,3), 3)) //---> false
    println(canAddFish(10.0, listOf(), 7, true))// ---> true

}

fun swim(){
    //swim
}

fun canAddFish(tankSize :Double, currentFish :List<Int>, NewfishSize :Int = 2, hasdecorate :Boolean = true) :Boolean{
    var tank :Double = 0.0
    if (hasdecorate) { tank = tankSize.times(0.8)} else tank = tankSize
    var currentFishtotal :Int = 0
    for (i in currentFish){
        currentFishtotal= currentFishtotal.plus(i)}
    print(tankSize-currentFishtotal.toDouble()-NewfishSize.toDouble())
    return if(tank-currentFishtotal.toDouble()-NewfishSize.toDouble() <0) false else true
}




fun swim(speed :String = "fast", example :Int = 20, ex2 :String) :Boolean{
    println("Swimming $speed, $example, $ex2")
    return true
}

fun feedtheFish(dated :String?, fooded :String?) {// pick a random day of a week and output different food for each day
    println("Today is $dated and $fooded")
}
fun randomD(num :Int) :Int {
    return Random().nextInt(num)//random from 0 to num-1
}
data class Stat(val day: String?, val food: String)
fun dayOfWeek() :Stat {
    //val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var selected = randomD(6)
    println(selected)
    var daystring: String? = null
    var food: String  =""
        when (selected) {
            1 -> {
                daystring = "Sunday"
                food = "flakes" }
            2 -> {
                daystring = "Mon"
                food = "pellets" }
            3 -> {
                daystring = "tue"
                food = "redworms" }
            4 -> {
                daystring = "wed"
                food = "grandules"}
            5 -> {
                daystring = "thu"
                food = "lettuce"}
            6 -> {
                daystring = "fri"
                food= "plankton"}
            else -> {
                daystring = "Sat"
                food = "mosquito"}
        }
    return Stat(daystring, food )
}