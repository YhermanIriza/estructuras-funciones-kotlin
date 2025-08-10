fun main() {
    val numeros = arrayOf(2, 3, 4)
    var multiplicacion = 1

    for (num in numeros) {
        multiplicacion *= num
    }

    println("Multiplicación total: $multiplicacion")
}
