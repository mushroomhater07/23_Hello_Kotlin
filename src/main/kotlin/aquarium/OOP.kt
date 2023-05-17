package aquarium

interface Fishsss{    //anytime you cant complete the class
    val color : String;
}
interface FishAction{ //use interface if lots of method
    fun eat()
}
abstract class AquaFish1: FishAction{    //interface delegation +add feature to class
    abstract val length : Float;
    override fun eat() {
        println("eaten")
    }

}
class shark(fishcolor: Fishsss = GoldColor):Fishsss by fishcolor, FishAction{
    override val color = "gray";
    override fun eat() {
        println("eat")
    }
}
object GoldColor :Fishsss{ //singleton pattern
    override val color = "gold";
}
object RedColor :Fishsss{
    override val color = "red"
}