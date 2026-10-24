fun main() {
    val name = "Juan"
    val grade1 = 5.0
    val grade2 = 3.5
    val grade3 = 4.5

    val average = (grade1 + grade2 + grade3) / 3

    println("Estudiante: $name")
    println("Calificacion 1: $grade1")
    println("Calificacion 2: $grade2")
    println("Calificacion 3: $grade3")
    println("Promedio: $average")

    if (average >= 3.0) {
        println("Estado: Aprobado")
    } else {
        println("Estado: Reprobado")
    }

    if (average >= 4.5) {
        println("¡Excelente desempeño!")
    }
}
