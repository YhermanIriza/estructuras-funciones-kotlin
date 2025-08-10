fun main() {
    val numeros = listOf(5, 7, 3, -2, 8)
    var suma = 0

    for (num in numeros) {
        if (num < 0) break
        suma += num
    }

    println("Suma hasta el primer negativo: $suma")
}
