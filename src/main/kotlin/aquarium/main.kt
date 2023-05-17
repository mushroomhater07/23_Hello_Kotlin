package aquarium

fun main(args: Array<String>){
    buildAquarium()
    val shark = shark()
    println(shark.color)
}

abstract class AquaFish{
    abstract val color :String
}

fun buildAquarium(){
    val myAqua = Aquarium()
    println("length ${myAqua.length}, width ${myAqua.width}, height ${myAqua.height}")
    myAqua.height = 80
    println("length ${myAqua.length}, width ${myAqua.width}, height ${myAqua.height}")
    println("vol: ${myAqua.calc()}, vol ${myAqua.volume}")
    val myAqua1 = Aquarium(10,20,10)
    println("length ${myAqua1.length}, width ${myAqua1.width}, height ${myAqua1.height}")
    val myAquaConstructo = Aquarium(noOfFish = 7)
    println("length ${myAquaConstructo.length}, width ${myAquaConstructo.width}, height ${myAquaConstructo.height}")
}
