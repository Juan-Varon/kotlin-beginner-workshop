fun main() {
    val number = 5
    var sum = 0

    println("Tabla de multiplicar del $number")

    for (i in 1..10) {
        val result = number * i

        println("$number x $i = $result")

        sum = sum + result
    }

    println("La suma de todos los resultados es: $sum")
}
