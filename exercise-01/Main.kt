fun main() {
    val number1 = 20.0
    val number2 = 5.0
    val operation = "/"

    when (operation) {
        "+" -> {
            val result = number1 + number2
            println("$number1 + $number2 = $result")
        }

        "-" -> {
            val result = number1 - number2
            println("$number1 - $number2 = $result")
        }

        "*" -> {
            val result = number1 * number2
            println("$number1 * $number2 = $result")
        }

        "/" -> {
            if (number2 != 0.0) {
                val result = number1 / number2
                println("$number1 / $number2 = $result")
            } else {
                println("Error: no se puede dividir entre cero.")
            }
        }

        else -> {
            println("Error: operacion no valida.")
        }
    }
}