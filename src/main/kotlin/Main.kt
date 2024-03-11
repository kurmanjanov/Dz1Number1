fun main() {

    var  HiGeeks: String


    val NUM = 23


    var word = "Dz"


     HiGeeks = "$NUM $word"


    println("lessonJavaGood: $HiGeeks, NUM: $NUM, word:$word")


    when{
        NUM < 0-> println("Вы сохронили отрицательное число")
        NUM > 0-> println("Вы сохронили положительное число")
        else -> println("Вы сохранили нуль" )
    }
}