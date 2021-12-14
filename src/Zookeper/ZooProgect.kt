package Zookeper

    fun main() {
        val camel = "camel"
        val lion = "lion"
        val deer = "deer"
        val goose = "goose"
        val bat = "bat"
        val rabbit = "rabbit"
      //  var numberOfHabitat = 0
        val endOfProgram = "See you later!"
        var numberOfHabitat = " "
        val animals = arrayOf(camel, lion, deer, goose, bat, rabbit)
        do {   println("Please enter the number of the habitat you would like to view: ")
            var numberOfHabitat = readLine()!!
            if (numberOfHabitat == "exit") {println(endOfProgram)}

         //   if (n <= animals.lastIndex) {
            else { println(animals[numberOfHabitat.toInt()])}
            }

        while (numberOfHabitat != "exit")
    }