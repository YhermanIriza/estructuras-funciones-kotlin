fun primerMultiploDe4(lista: List<Int>): Int? {
    for (num in lista) {
        if (num % 4 == 0) return num
    }
    return null
}

fun main() {
    val numeros = listOf(3, 5, 8, 10)
    val resultado = primerMultiploDe4(numeros)
    println("Primer múltiplo de 4: $resultado")
}

