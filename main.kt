import kotlin.math.abs

fun main() {
    var guess = 0
    val answer = 98
    var value: Int

    while (guess != answer){
            print("Enter a number between 90 and 110: ")

                guess = readLine()!!.toInt()
                value = abs(guess - answer)
                if (value < 97.5)
                    println("low")
                else if (value > 99.5)
                    println("high")
                else
                    println("normal")
        }

        println("That is correct, the number is $answer")
}