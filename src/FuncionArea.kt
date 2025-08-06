// Función que calcula el área de un triángulo
fun calcularAreaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun main() {
    print("Ingrese la base del triángulo: ")
    val base = readLine()?.toDoubleOrNull()

    print("Ingrese la altura del triángulo: ")
    val altura = readLine()?.toDoubleOrNull()

    if (base != null && altura != null) {
        val area = calcularAreaTriangulo(base, altura)
        println("El área del triángulo es: $area")
    } else {
        println("Datos inválidos. Ingrese valores numéricos.")
    }
}
