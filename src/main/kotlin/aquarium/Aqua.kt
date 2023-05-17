package aquarium

open class Aquarium (var length :Int = 20, var width :Int = 39, var height :Int = 12) {
    // var length = 20
    //var width = 39
    //var height = 12
    open var volume :Int
        get() {
            return width * height * length / 1000
        }
        set(value) {height = value*1000/width/length}
    open var water = volume * 0.9
    fun calc() :Int = width * height * length /1000

    constructor(noOfFish: Int): this(){
        val water = noOfFish.times(0.9)
        height = water.toInt()
    }

}

class TowerTank(): Aquarium(){
    override var water = volume *0.8
    override var volume :Int
        get() {
            return width * height * length / 1000
        }
        set(value) {height = value*1000/width/length}
}

class SimpleSpice(name : String =  "", var spiciness :String = "mild") {
    var heat :Int
        get() {return 5}
        set(value) { when (value){
            in 1..4 -> spiciness = "mild"
            5 -> spiciness = "hot"
            in 6..10 -> spiciness = "extreme"
        }
        }
    val SpiceName :List<String> = listOf("hreb", "yellowginger", "alladin")
    val Spice = listOf(SpiceName)
    init{
        println("level of spice: $Spice")
    }
    fun makeSalt(){

    }
        // heat with getter, return Int to spiciness

}

open class Book(var title: String ="", var author :String = ""){
    private var currentPage = 0
    open fun readPage() {currentPage= currentPage++}
}
class eBook(var text :Int = 0 ) : Book(){
    override fun readPage(){
        text += 250
    }

}