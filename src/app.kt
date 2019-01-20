import kotlin.random.Random


fun main(args: Array<String>): Unit {

    val choices = arrayOf("Rock", "Paper", "Scissors")

    val gameChoice = getComputerChoice(choices)
    val userChoice = getUserChoice2(choices)
    printResults(gameChoice, userChoice)

}

fun getComputerChoice(choices: Array<String>) = choices[Random.nextInt(choices.size)]


fun getUserChoice(choices: Array<String>) :String {
    var message = "Please enter one of the following:"
    for (item in choices) message+=" $item"
    message+="."
    return message
}

fun getUserChoice2(choices: Array<String>) :String {
    while ( true ) {
        print("Please enter one of the following:")
        for (item in choices) print(" $item")
        print(".")
        var userInput = readLine()
        if (userInput != null && userInput in choices) return  userInput
    }
}

fun printResults(gameChoice : String, userChoice: String ) : Unit {
    var result = ""
    if (gameChoice == userChoice) result = "it s a tie"
    else
    if (userChoice == "Rock" && gameChoice == "Scissors" ||
        userChoice == "Paper" && gameChoice == "Rock" ||
        userChoice == "Scissors" && gameChoice == "Paper")
        result = "you win"
    else result = "Computer wins"

    println("you chose $userChoice, computer chose $gameChoice, $result")

}

