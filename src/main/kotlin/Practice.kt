
//use birthday determine fortune until  take it easy  appears
fun main(args: Array<String>) {
        //if (fortune.contains("Take it easy")) break;
getFortune(getBirthday())
}

fun getBirthday(): Int{
    print("Enter your birthday")
    var birthday = readLine()
    if (birthday?.toIntOrNull() == null) birthday = "1"
    return birthday.toInt()
}
fun getFortune(birth :Int){
    var again = true
    var ans :String= ""
    while (again == true){
        when(birth){
            in 1..12 -> ans = "ppl always ask you month or day"
            in 28..31 -> ans = "lucky you"
            else -> ans = getFortuneCookie(birth.mod(7))
        }
        println("Your fortune is: $ans")
        if (ans =="Take it easy and enjoy life!") again= false else getFortune(getBirthday())


    }
}
fun getFortuneCookie(num :Int) :String{

    var answer :String = ""
    when (num){
        0 -> answer ="You will have a great day!"
        1 -> answer = "Things will go well for you today."
        2 -> answer = "Enjoy a wonderful day of success."
        3 -> answer = "Be humble and all will turn out well."
        4 -> answer = "Today is a good day for exercising restraint."
        5 -> answer = "Take it easy and enjoy life!"
        6 -> answer = "Treasure your friends because they are your greatest fortune."

    }
    return answer
}
