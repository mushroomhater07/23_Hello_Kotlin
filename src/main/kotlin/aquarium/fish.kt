package aquarium

class Fish ( val friendly: Boolean = true , vol :Int){

    val size: Int
    init { println("first init block")     }
    constructor() : this( false , 9 ){ println("second constructor")  }
    init {   if(friendly){size  = vol} else size = vol.times(2)    }
    init { println("constructed fish $vol, ${this.size}")}
    init { println("last init block")}
    constructor(gay :Boolean = true): this() {  println("this is last constructor")    }
}
fun makeDefault() = Fish(true , 50)
fun main(){
    makeDefault()
    println()
    Fish(gay = false)
    println()
    Fish()
}