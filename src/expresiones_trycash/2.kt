fun main() {
    print("Ingrese un número: ")
    val entrada = readLine() ?: ""

    try {
        val numero = entrada.toInt()
        println("Número convertido: $numero")
    } catch (_: NumberFormatException) {
        println("Error: No es un número válido.")
    }
}
