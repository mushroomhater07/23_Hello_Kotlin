import kotlin.random.Random

fun main(){
    filtering()
    println(rollDice(4))
    println(rollDice2(6))
    repeat(2) {
        print("Input mood")
        println(whatShouldIDoToDay(modd(), temperature = temp()))
    }
}
fun gamePlay(dice: Int)= Random.nextInt(dice)
val rollDice : (Int) -> Int= {dice -> Random.nextInt(dice-1) + 1}
fun rollDice2(dice: Int):Int = Random.nextInt(dice-1) + 1
fun filtering(){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val curries = spices.filter{it.contains("curry")}
    val ce = spices.filter{ it[0] == 'c' && it[it.length-1] == 'e'}
    val first3: MutableList<String> = mutableListOf()
    for(i in 0..2 )first3.add(spices[i])
    val first3c = first3.filter{ it[0] == 'c'}
    println("$spices, $curries, $ce, $first3, $first3c")
}

fun modd() = readLine()!!
fun weath() = "sun" +"ny"
fun temp() = 30
fun whatShouldIDoToDay(mood :String, weather :String = weath(), temperature :Int = 24) :String{
   return when {
       mood == "happy" && weather == "sunny" -> "go for a walk"
       mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
       temperature > 35 -> "go swimming"
       else -> "Stay home adn read."
   }
}
