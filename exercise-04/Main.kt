
fun main() {
    val numbers = listOf(12, 7, 4, 15, 8, 3, 20, 11, 6, 9)

    var sum = 0
    var parCount = 0
    var imparCount = 0

    var largest = numbers[0]
    var smallest = numbers[0]

    println("Lista de numeros:")
    
    for (number in numbers) {
        println(number)

        sum = sum + number

        if (number % 2 == 0) {
            parCount++
        } else {
            imparCount++
        }

        if (number > largest) {
            largest = number
        }

        if (number < smallest) {
            smallest = number
        }
    }

    val average = sum.toDouble() / numbers.size

    println("Suma: $sum")
    println("Promedio: $average")
    println("Numero mayor: $largest")
    println("Numero menor: $smallest")
    println("Cantidad de pares: $parCount")
    println("Cantidad de impares: $imparCount")
}
