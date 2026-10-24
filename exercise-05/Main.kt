
fun isPrime(number: Int): Boolean {
    if (number < 2) {
        return false
    }

    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}

fun factorial(number: Int): Long {
    require(number >= 0) {
        "El factorial solo esta definido aqui para numeros no negativos"
    }

    var result = 1L

    for (i in 1..number) {
        result *= i
    }

    return result
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun main() {
    val number = 2

    println("Numero: $number")
    println("Es primo: ${isPrime(number)}")
    println("Factorial: ${factorial(number)}")
    println("Es par: ${isEven(number)}")
}
